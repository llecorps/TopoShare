package org.lle.demo.topo.business.contract;


import org.lle.demo.topo.business.contract.manager.LocationManager;
import org.lle.demo.topo.business.contract.manager.TopoManager;
import org.lle.demo.topo.business.contract.manager.UtilisateurManager;

/**
 * Factory des Managers
 */
public interface ManagerFactory {


    UtilisateurManager getUtilisateurManager();

    /*
    default TopoManager getTopoManager() {
        return null;
    }*/
    TopoManager getTopoManager();
    LocationManager getLocationManager();
}
