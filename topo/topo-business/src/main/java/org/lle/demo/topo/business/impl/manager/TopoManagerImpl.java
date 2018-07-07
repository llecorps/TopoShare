package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.consumer.dao.TopoDao;
import org.lle.demo.topo.model.bean.Topo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by esspressoh on 28.06.18.
 */
public class TopoManagerImpl {

    private String libelle, lieu;
    private int utilisateur;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    TopoDao topodao=(TopoDao)ctx.getBean("topodao");

    public TopoManagerImpl() {

    }

    public void ajoutTopo(String libelle, String lieu, int utilisateur)  {

        this.libelle = libelle;
        this.lieu = lieu;
        this.utilisateur = utilisateur;

        int status=topodao.saveTopo(new Topo(this.libelle, this.lieu, this.utilisateur));
        System.out.println(status);

    }
}
