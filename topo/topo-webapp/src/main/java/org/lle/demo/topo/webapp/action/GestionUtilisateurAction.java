package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.lle.demo.topo.webapp.WebappHelper;

import java.util.List;


/**
 * Created by esspressoh on 09.07.18.
 */
public class GestionUtilisateurAction extends ActionSupport {

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private List<Utilisateur> listUtilisateur;
    private Utilisateur utilisateur, User;



    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public List<Utilisateur> getListUtilisateur() {
        return listUtilisateur;
    }



    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    // ==================== Méthodes ====================
    /**
     * Action listant les {@link Utilisateur}
     * @return success
     */
    public String doList() {

        listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        return ActionSupport.SUCCESS;
    }

    public String doDetail() {
        if (id == null) {
            this.addActionError("Vous devez indiquer un id d'utilisateur");
        } else {
            try {
                utilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getUtilisateur(id);
            } catch (NotFoundException pE) {
                this.addActionError("Utilisateur non trouvé. ID = " + id);
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
        if (this.utilisateur != null) {
/*
            // Récupération du responsable
            if (this.utilisateur.getId() == null) {
               this.addFieldError("utilisateur.id", "ne doit pas être vide");
            } else {
              try {
                    Utilisateur vIdutilisateur
                          = WebappHelper.getManagerFactory().getUtilisateurManager()
                         .getUtilisateur(this.utilisateur.getResponsable().getId());
                    this.utilisateur.setResponsable(vIdutilisateur);
                } catch (NotFoundException pEx) {
                 this.addFieldError("utilisateur.responsable.id", pEx.getMessage());
               }
            }
            // Date de création
            //this.topo.setDateCreation(new Date());

            // Si pas d'erreur, ajout du projet...
           if (!this.hasErrors()) {
*/
                try {

            WebappHelper.getManagerFactory().getUtilisateurManager().addUser(this.utilisateur.getUsername(), this.utilisateur.getEmail(), this.utilisateur.getPassword());

                    // Si ajout avec succès -> Result "success"
                    vResult = ActionSupport.SUCCESS;
                    this.addActionMessage("Projet ajouté avec succès");

               } catch (FunctionalException pEx) {
                    // Sur erreur fonctionnelle on reste sur la page de saisie
                    // et on affiche un message d'erreur
                this.addActionError(pEx.getMessage());

                } catch (TechnicalException pEx) {
                    // Sur erreur technique on part sur le result "error"
                   // this.addActionError(pEx.getMessage());
                 vResult = ActionSupport.ERROR;
                }
            }
        //}

        // Si on doit aller sur le formulaire de saisie, il faut ajouter les info nécessaires
        if (vResult.equals(ActionSupport.INPUT)) {
           this.listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        }
        if (vResult.equals(ActionSupport.SUCCESS)) {
            try {
            this.User = WebappHelper.getManagerFactory().getUtilisateurManager().getUtilisateur(utilisateur.getUsername());

            } catch (NotFoundException pE) {
                this.addActionError("Utilisateur non trouvé");
            }
        }

        return vResult;

    }

}
