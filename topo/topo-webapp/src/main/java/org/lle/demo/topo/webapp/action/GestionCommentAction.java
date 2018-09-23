package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Commentaire;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.lle.demo.topo.webapp.WebappHelper;

import java.util.List;


public class GestionCommentAction extends ActionSupport {

    // ==================== Attributs ====================
    // ----- Paramètres en entrée

    private Integer id;
    private String comment;
    private Integer topo_idtopo;

    // ----- Eléments en sortie
    private Commentaire commentaire;
    private List<Commentaire> vListcommentaire;
    private Topo topo;
    private List<Topo> listTopo;

    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getTopo_idtop() {
        return topo_idtopo;
    }

    public void setTopo_idtop(Integer top_idtop) {
        this.topo_idtopo = top_idtop;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    public List<Commentaire> getvListcommentaire() {
        return vListcommentaire;
    }

    public void setvListcommentaire(List<Commentaire> vListcommentaire) {
        this.vListcommentaire = vListcommentaire;
    }

    public List<Topo> getListTopo() {
        return listTopo;
    }
// ==================== Méthodes ====================

    /**
     * Action permettant de créer un nouveau {@link Commentaire}
     * @return input / success / error
     */
    public String doCreate() {
        // Si (this.projet == null) c'est que l'on entre dans l'ajout de projet
        // Sinon, c'est que l'on vient de valider le formulaire d'ajout

        // Par défaut, le result est "input"
        String vResult = ActionSupport.INPUT;

        // ===== Validation de l'ajout de projet (projet != null)
        if (this.commentaire != null) {
            // Récupération du responsable
            if (this.commentaire.getTopoguide() == null
                    || this.commentaire.getTopoguide().getId() == null) {
                this.addFieldError("comment.topoguide.id", "ne doit pas être vide");
            } else {
                try {
                    Topo vTopoguide
                            = WebappHelper.getManagerFactory().getTopoManager()
                            .detailTopo(this.commentaire.getTopoguide().getId());
                    this.commentaire.setTopoguide(vTopoguide);
                } catch (NotFoundException pEx) {
                    this.addFieldError("comment.topoguide.id", pEx.getMessage());
                }
            }
            // Date de création
            //this.topo.setDateCreation(new Date());

            // Si pas d'erreur, ajout du projet...
            if (!this.hasErrors()) {
                try {

                    WebappHelper.getManagerFactory().getCommentManager().addComment(this.commentaire.getDescription(), this.commentaire.getTopoguide(), this.commentaire.getResponsable());
                    // Si ajout avec succès -> Result "success"
                    vResult = ActionSupport.SUCCESS;
                    this.addActionMessage("Commentaire ajouté avec succès");

                } catch (FunctionalException pEx) {
                    // Sur erreur fonctionnelle on reste sur la page de saisie
                    // et on affiche un message d'erreur
                    this.addActionError(pEx.getMessage());

                } catch (TechnicalException pEx) {
                    // Sur erreur technique on part sur le result "error"
                    this.addActionError(pEx.getMessage());
                    vResult = ActionSupport.ERROR;
                }
            }
        }

        // Si on doit aller sur le formulaire de saisie, il faut ajouter les info nécessaires
        if (vResult.equals(ActionSupport.INPUT)) {
            this.listTopo = WebappHelper.getManagerFactory().getTopoManager().ListTopo();
        }

        return vResult;
    }



}
