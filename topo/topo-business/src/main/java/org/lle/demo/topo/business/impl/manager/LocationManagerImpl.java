package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.consumer.dao.LocationDao;
import org.lle.demo.topo.model.bean.Location;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 01.07.18.
 */
@Named
public class LocationManagerImpl {

    private String dateDeb, dateFin;
    private int idUtilisateur, idTopo;

    protected List<Location> vListLocation;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    LocationDao dao=(LocationDao)ctx.getBean("locationdao");

    public LocationManagerImpl() {

    }

    public void ajoutLocation(String dateDeb, String dateFin, int utilisateur, int topo)  {

        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.idUtilisateur = utilisateur;
        this.idTopo = topo;

        int status=dao.saveLocation(new Location(this.dateDeb, this.dateFin, this.idUtilisateur,this.idTopo));
        System.out.println(status);

    }

    public List ListeLocation() {

        vListLocation = new ArrayList<>() ;
        vListLocation=dao.getlistLocation();

        return vListLocation;
    }


}
