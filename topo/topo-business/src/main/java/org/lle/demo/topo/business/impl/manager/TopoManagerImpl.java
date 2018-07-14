package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.TopoManager;
import org.lle.demo.topo.consumer.dao.TopoDao;
import org.lle.demo.topo.model.bean.Topo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 28.06.18.
 */
@Named
public class TopoManagerImpl implements TopoManager{

    private String libelle, lieu;
    private int utilisateur;

    protected List<Topo> vListTopo;

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
    public List ListTopo() {

        vListTopo = new ArrayList<>() ;
        vListTopo=topodao.getlistTopo();

        return vListTopo;
    }
}
