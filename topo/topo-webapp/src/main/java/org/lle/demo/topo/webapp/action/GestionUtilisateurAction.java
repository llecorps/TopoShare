package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Utilisateur;
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
    private Utilisateur utilisateur;



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

    // ==================== Méthodes ====================
    /**
     * Action listant les {@link Utilisateur}
     * @return success
     */
    public String doList() {

        listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        return ActionSupport.SUCCESS;
    }



}
