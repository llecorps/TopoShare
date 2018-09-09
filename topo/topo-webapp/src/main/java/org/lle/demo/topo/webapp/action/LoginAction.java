package org.lle.demo.topo.webapp.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.webapp.WebappHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Action de gestion de la connexion/déconnexion d'un utilisateur
 */
public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware {

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    private HttpServletRequest servletRequest;

    @Override
    public void setServletRequest(HttpServletRequest pRequest) {
        this.servletRequest = pRequest;
    }

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String login;
    private String password;


    // ==================== Getters/Setters ====================
    public String getLogin() {
        return login;
    }
    public void setLogin(String pLogin) {
        login = pLogin;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String pPassword) {
        password = pPassword;
    }


    // ==================== Méthodes ====================
    /**
     * Action permettant la connexion d'un utilisateur
     * @return input / success
     */
    public String doLogin() {
        String vResult = ActionSupport.INPUT;
        if (!StringUtils.isAllEmpty(login, password)) {

                Utilisateur vUtilisateur
                        = WebappHelper.getManagerFactory().getUtilisateurManager()
                        .getUtilisateur(login, password);

                System.out.println("Retour DAO:"+vUtilisateur.getUsername()+vUtilisateur.getPassword());


                if (vUtilisateur.getUsername().equals(login) &&  vUtilisateur.getPassword().equals(password)) {
                    // Ajout de l'utilisateur en session
                    this.session.put("utilisateur", vUtilisateur);

                    vResult = ActionSupport.SUCCESS;
                } else {


                     this.addActionError("Identifiant ou mot de passe invalide !");
                    vResult = ActionSupport.ERROR;
            }
        }

        return vResult;
    }


    /**
     * Action de déconnexion d'un utilisateur
     * @return success
     */
    public String doLogout() {
        // Invalidation de la session
        this.servletRequest.getSession().invalidate();

        return ActionSupport.SUCCESS;
    }
}
