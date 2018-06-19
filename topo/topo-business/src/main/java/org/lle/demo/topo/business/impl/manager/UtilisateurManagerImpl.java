package org.lle.demo.topo.business.impl.manager;

import org.lle.demo.topo.consumer.dao.UtilisateurDao;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by esspressoh on 19.06.18.
 */
public class UtilisateurManagerImpl {

    public UtilisateurManagerImpl()  {}

    public void ajoutUtilisateur()  {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

    UtilisateurDao dao=(UtilisateurDao)ctx.getBean("edao");
    int status=dao.saveUtilisateur(new Utilisateur(4,"rachel", "rachel@mail.com","password"));
    System.out.println(status);

    }


}
