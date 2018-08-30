package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Location;
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
public class GestionLocationAction extends ActionSupport {

    // ==================== Attributs ====================
    // ----- Paramètres en entrée

    private Integer id;

    // ----- Eléments en sortie
    private List<Location> listLocation;
    private Location location;
    private List<Topo> listTopo;
    private List<Utilisateur> listUtilisateur;



    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }


    public void setId(Integer pId) {
        id = pId;
    }

    public List<Location> getListLocation() {
        return listLocation;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location pLocation) {
        this.location = pLocation;
    }

    public List<Topo> getListTopo() {
        return listTopo;
    }


    public List<Utilisateur> getListUtilisateur() {
        return listUtilisateur;
    }


    // ==================== Méthodes ====================
    /**
     * Action listant les {@link Location}
     * @return success
     */
    public String doList() {

        listLocation = WebappHelper.getManagerFactory().getLocationManager().ListeLocation();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@link Location}
     * @return success / error
     */
    public String doDetail() {
        if (id == null) {
            this.addActionError(getText("error.location.missing.id"));
        } else {
            try {
                location = WebappHelper.getManagerFactory().getLocationManager().detailLocation(id);
            } catch (NotFoundException pE) {
                this.addActionError(getText("error.location.notfound", Collections.singletonList(id)));
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }


    // ==================== Méthodes ====================
    /**
     * Action permettant de créer un nouveau {@link Location}
     * @return input / success / error
     */
    public String doCreate() {
        // Si (this.projet == null) c'est que l'on entre dans l'ajout de projet
        // Sinon, c'est que l'on vient de valider le formulaire d'ajout

        // Par défaut, le result est "input"
        String vResult = ActionSupport.INPUT;

        // ===== Validation de l'ajout de projet (projet != null)
        if (this.location != null) {
            // Récupération du Topo
            if (this.location.getTopo() == null
                    || this.location.getTopo().getId() == null) {
                this.addFieldError("location.topo.id", "ne doit pas être vide");
            } else {
                try {
                    Topo vTopo
                            = WebappHelper.getManagerFactory().getTopoManager()
                            .detailTopo(this.location.getTopo().getId());
                    this.location.setTopo(vTopo);
                    Utilisateur vResponsable
                            = WebappHelper.getManagerFactory().getUtilisateurManager()
                            .getUtilisateur(this.location.getResponsable().getId());
                    this.location.setResponsable(vResponsable);

                } catch (NotFoundException pEx) {
                    this.addFieldError("location.topo.id", pEx.getMessage());
                }
            }
            // Date de création
            //this.topo.setDateCreation(new Date());

            // Si pas d'erreur, ajout du projet...
            if (!this.hasErrors()) {

                try {

                WebappHelper.getManagerFactory().getLocationManager().ajoutLocation(this.location.getDatedeb(), this.location.getDatefin(), this.location.getResponsable(), this.location.getTopo());
                // Si ajout avec succès -> Result "success"
                vResult = ActionSupport.SUCCESS;
                this.addActionMessage("Location ajoutée avec succès");

            } catch (FunctionalException pEx) {
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
            this.listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        }

        return vResult;
    }



}
