package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.LocationManager;
import org.lle.demo.topo.consumer.dao.LocationDao;
import org.lle.demo.topo.model.bean.Location;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 01.07.18.
 */
@Named
public class LocationManagerImpl implements LocationManager {

    private String dateDeb, dateFin;
    private int idUtilisateur, idTopo;

    protected List<Location> vListLocation;

    private Location newLocation;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    LocationDao locationdao=(LocationDao)ctx.getBean("locationdao");

    public LocationManagerImpl() {

    }

    public void ajoutLocation(String dateDeb, String dateFin, Utilisateur utilisateur, Topo topo)  {



        int status=locationdao.saveLocation(new Location(dateDeb, dateFin, utilisateur, topo));
        System.out.println(status);

    }



    public List ListeLocation() {

        vListLocation = new ArrayList<>() ;
        vListLocation=locationdao.getlistLocation();

        return vListLocation;
    }

    public Location detailLocation(Integer id) throws NotFoundException {

        newLocation =locationdao.getLocation(id);
        return newLocation;
    }



}
