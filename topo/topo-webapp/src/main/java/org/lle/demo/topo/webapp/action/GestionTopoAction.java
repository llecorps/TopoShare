package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.lle.demo.topo.webapp.WebappHelper;

import java.util.Collections;
import java.util.List;

/**
 * Created by esspressoh on 19.07.18.
 */
public class GestionTopoAction extends ActionSupport {

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private static Integer id;


    //private String libelle;
    //private String lieu;
    //private static Integer idUtilisateur;
    //private static Integer idLocation;

    // ----- Eléments en sortie
    private List<Topo> listTopo;
    private Topo topo;

    private List<Utilisateur> listUtilisateur;

    // ==================== Getters/Setters ====================
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        GestionTopoAction.id = id;
    }

    public List<Topo> getListTopo() {
        return listTopo;
    }

    public void setListTopo(List<Topo> listTopo) {
        this.listTopo = listTopo;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public List<Utilisateur> getListUtilisateur() {
        return listUtilisateur;
    }

    // ==================== Méthodes ====================
    /**
     * Action listant les {@link Utilisateur}
     * @return success
     */
    public String doList() {

        listTopo = WebappHelper.getManagerFactory().getTopoManager().ListTopo();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@link Topo}
     * @return success / error
     */
    public String doDetail() {
        if (id == null) {
            this.addActionError(getText("error.project.missing.id"));
        } else {
            try {
                topo = WebappHelper.getManagerFactory().getTopoManager().detailTopo(id);
            } catch (NotFoundException pE) {
                this.addActionError(getText("error.project.notfound", Collections.singletonList(id)));
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }


    // ==================== Méthodes ====================
    /**
     * Action permettant de créer un nouveau {@link Topo}
     * @return input / success / error
     */
    public String doCreate() {
        // Si (this.projet == null) c'est que l'on entre dans l'ajout de projet
        // Sinon, c'est que l'on vient de valider le formulaire d'ajout

        // Par défaut, le result est "input"
        String vResult = ActionSupport.INPUT;

        // ===== Validation de l'ajout de projet (projet != null)
        if (this.topo != null) {
            // Récupération du responsable
            if (this.topo.getResponsable() == null
                    || this.topo.getResponsable().getId() == null) {
                this.addFieldError("topo.responsable.id", "ne doit pas être vide");
            } else {
                try {
                    Utilisateur vResponsable
                            = WebappHelper.getManagerFactory().getUtilisateurManager()
                            .getUtilisateur(this.topo.getResponsable().getId());
                    this.topo.setResponsable(vResponsable);
                } catch (NotFoundException pEx) {
                    this.addFieldError("topo.responsable.id", pEx.getMessage());
                }
            }
            // Date de création
            //this.topo.setDateCreation(new Date());

            // Si pas d'erreur, ajout du projet...
            if (!this.hasErrors()) {
                try {

                    WebappHelper.getManagerFactory().getTopoManager().ajoutTopo(this.topo.getLibelle(), this.topo.getLieu(), this.topo.getResponsable());
                    // Si ajout avec succès -> Result "success"
                    vResult = ActionSupport.SUCCESS;
                    this.addActionMessage("Projet ajouté avec succès");

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
            this.listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        }

        return vResult;
    }



}
