package org.lle.demo.topo.business.contract.manager;


import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

import java.util.List;


/**
 * Manager du package « utilisateur »
 */
public interface UtilisateurManager {

    /**
     * Renvoie la liste des {@link Utilisateur}
     *
     * @return List
     */
    List<Utilisateur> getListUtilisateur();

    /**
     * Renvoie l'{@link Utilisateur} demandé
     *
     * @param pId l'identifiant de l'Utilisateur
     * @return Le {@link Utilisateur}
     * @throws NotFoundException Si l'Utilisateur n'est pas trouvé
     */
    Utilisateur getUtilisateur(Integer pId) throws NotFoundException;

    Utilisateur getUtilisateur(String user) throws NotFoundException;


    /**
     * Renvoie l'{@link Utilisateur} correspondant au couple login / mot de passe
     *
     * @param pLogin le login de l'Utilisateur
     * @param pPassword le mot de passe de l'Utilisateur
     * @return Le {@link Utilisateur}
     * @throws NotFoundException Si l'Utilisateur n'est pas trouvé
     */
    Utilisateur getUtilisateur(String pLogin, String pPassword) ;

   void addUser(String username, String email, String password) throws FunctionalException, TechnicalException;


}
