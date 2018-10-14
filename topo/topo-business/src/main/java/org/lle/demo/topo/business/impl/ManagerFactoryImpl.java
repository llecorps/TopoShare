package org.lle.demo.topo.business.impl;

import org.lle.demo.topo.business.contract.ManagerFactory;
import org.lle.demo.topo.business.contract.manager.*;

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
    @Inject
    private CommentManager commentManager;
    @Inject
    private VoieManager voieManager;
    @Inject
    private SearchManager searchManager;


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
    @Override
    public CommentManager getCommentManager() {
        return this.commentManager;
    }
    @Override
    public VoieManager getVoieManager() {
        return this.voieManager;
    }
    @Override
    public SearchManager getSearchManager() {
        return this.searchManager;
    }

}
