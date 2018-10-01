package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Commentaire;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Voie;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.lle.demo.topo.webapp.WebappHelper;

import java.util.Collections;
import java.util.List;

/**
 * Created by esspressoh on 30.09.18.
 */
public class GestionVoieAction extends ActionSupport {

    // ==================== Attributs ====================

    private Integer id;
    private Integer idtopo;
    private Voie voie;
    private List<Voie> listVoie;
    private Topo topo;
    private List<Topo> listTopo;
    // ----- Paramètres en entrée

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdtopo() {
        return idtopo;
    }

    public void setIdtopo(Integer idtopo) {
        this.idtopo = idtopo;
    }

    public List<Voie> getListVoie() {
        return listVoie;
    }

    public void setListVoie(List<Voie> listVoie) {
        this.listVoie = listVoie;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public List<Topo> getListTopo() {
        return listTopo;
    }

    public void setListTopo(List<Topo> listTopo) {
        this.listTopo = listTopo;
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
        if (this.voie != null) {
            // Récupération du responsable
            if (this.voie.getTopoguide() == null
                    || this.voie.getTopoguide().getId() == null) {
                this.addFieldError("Voie.topoguide.id", "ne doit pas être vide");
            } else {
                try {
                    Topo vTopoguide
                            = WebappHelper.getManagerFactory().getTopoManager()
                            .detailTopo(this.voie.getTopoguide().getId());
                    this.voie.setTopoguide(vTopoguide);
                } catch (NotFoundException pEx) {
                    this.addFieldError("comment.topoguide.id", pEx.getMessage());
                }
            }
            // Date de création
            //this.topo.setDateCreation(new Date());

            // Si pas d'erreur, ajout du projet...
            if (!this.hasErrors()) {
                try {

                    WebappHelper.getManagerFactory().getVoieManager().addVoie(this.voie.getLibelle(), this.voie.getNotation(), this.voie.getHauteur(),this.voie.getLargeur(),this.voie.getTopoguide());
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


    public String doDetail() {
        if (id == null) {
            this.addActionError(getText("error.voie.missing.id"));
        } else {
            try {
                voie = WebappHelper.getManagerFactory().getVoieManager().detailVoie(id);
                int vIdutilisateur = topo.getIdUtilisateur();
              //  utilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getUtilisateur(vIdutilisateur);

            } catch (NotFoundException pE) {
                this.addActionError(getText("error.topo.notfound", Collections.singletonList(id)));
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }





}
