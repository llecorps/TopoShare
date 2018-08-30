package org.lle.demo.topo.business.impl;

import org.lle.demo.topo.business.contract.ManagerFactory;
import org.lle.demo.topo.business.contract.manager.LocationManager;
import org.lle.demo.topo.business.contract.manager.TopoManager;
import org.lle.demo.topo.business.contract.manager.UtilisateurManager;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * Implémentation de la {@link ManagerFactory}.
 */
@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {


    @Inject
    private UtilisateurManager utilisateurManager;
    @Inject
    private TopoManager topoManager;
    @Inject
    private LocationManager locationManager;


    @Override
    public UtilisateurManager getUtilisateurManager() {
        return this.utilisateurManager;
    }
    @Override
    public TopoManager getTopoManager() {
        return this.topoManager;
    }
    @Override
    public LocationManager getLocationManager() {
        return this.locationManager;
    }

}
