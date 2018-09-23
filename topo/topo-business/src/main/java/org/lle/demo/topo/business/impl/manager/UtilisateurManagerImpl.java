package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.UtilisateurManager;
import org.lle.demo.topo.consumer.dao.UtilisateurDao;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 19.06.18.
 */
@Named
public class UtilisateurManagerImpl implements UtilisateurManager {

    private String username, email, password;

    protected List<Utilisateur> vListUtilisateur;

    private Utilisateur newUtilisateur;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(UtilisateurManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    UtilisateurDao utilisateurdao=(UtilisateurDao)ctx.getBean("utilisateurdao");

    public UtilisateurManagerImpl()  {}

    /**
     * Renvoie la liste des {@link Utilisateur}
     *
     * @return List
     */
    @Override
    public List<Utilisateur> getListUtilisateur() {
        vListUtilisateur = new ArrayList<>() ;
        vListUtilisateur=utilisateurdao.getlistUtilisateur();

        return vListUtilisateur;
    }

    /**
     * Renvoie l'{@link Utilisateur} demandé
     *
     * @param pId l'identifiant de l'Utilisateur
     * @return Le {@link Utilisateur}
     * @throws NotFoundException Si l'Utilisateur n'est pas trouvé
     */
    @Override
    public Utilisateur getUtilisateur(Integer pId) throws NotFoundException {
        newUtilisateur =utilisateurdao.getUtilisateur(pId);
        return newUtilisateur;
    }

    @Override
    public Utilisateur getUtilisateur(String user) throws NotFoundException {
        newUtilisateur =utilisateurdao.getUtilisateur(user);
        return newUtilisateur;
    }

    /**
     * Renvoie l'{@link Utilisateur} correspondant au couple login / mot de passe
     *
     * @param pLogin    le login de l'Utilisateur
     * @param pPassword le mot de passe de l'Utilisateur
     * @return Le {@link Utilisateur}
     * @throws NotFoundException Si l'Utilisateur n'est pas trouvé
     */
    @Override
    public Utilisateur getUtilisateur(String pLogin, String pPassword) {
        newUtilisateur =utilisateurdao.getUtilisateur(pLogin, pPassword );
        return newUtilisateur;
    }

    @Override
   public void addUser(String username, String email, String password) throws FunctionalException, TechnicalException {



        int status=utilisateurdao.saveUtilisateur(new Utilisateur(username, email, password));
        System.out.println(status);



    }


}
