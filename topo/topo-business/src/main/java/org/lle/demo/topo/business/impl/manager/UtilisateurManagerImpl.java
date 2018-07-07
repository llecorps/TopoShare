package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.consumer.dao.UtilisateurDao;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by esspressoh on 19.06.18.
 */
public class UtilisateurManagerImpl {

    private String username, email, password;

    protected List<Utilisateur> vListUtilisateur;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(UtilisateurManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    UtilisateurDao utilisateurdao=(UtilisateurDao)ctx.getBean("utilisateurdao");

    public UtilisateurManagerImpl()  {}

    public void ajoutUtilisateur(String username, String email, String password)  {
        this.username = username;
        this.email = email;
        this.password = password;

    int status=utilisateurdao.saveUtilisateur(new Utilisateur(this.username, this.email,this.password));
    System.out.println(status);

    }


    public List ListeUtilisateur() {

        vListUtilisateur = new ArrayList<>() ;
        vListUtilisateur=utilisateurdao.getlistUtilisateur();

        ListIterator listIterator = vListUtilisateur.listIterator();
        while(listIterator.hasNext()) {
            System.out.println("Liste U="+listIterator.next());
        }


        return vListUtilisateur;
    }
}
