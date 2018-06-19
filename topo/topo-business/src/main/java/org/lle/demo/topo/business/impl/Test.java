package org.lle.demo.topo.business.impl;

import org.lle.demo.topo.business.impl.manager.UtilisateurManagerImpl;

/**
 * Created by esspressoh on 19.06.18.
 */
public class Test {
    public static void main(String[] args) {
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //UtilisateurDao dao=(UtilisateurDao)ctx.getBean("edao");
        //int status=dao.saveUtilisateur(new Utilisateur(3,"louis", "louis@mail.com","password"));
        //System.out.println(status);
        UtilisateurManagerImpl newUtilisateur = new UtilisateurManagerImpl();
        newUtilisateur.ajoutUtilisateur();
    }
    }
