package org.lle.demo.topo.business.contract;


import org.lle.demo.topo.business.contract.manager.*;

/**
 * Factory des Managers
 */
public interface ManagerFactory {


    UtilisateurManager getUtilisateurManager();
    TopoManager getTopoManager();
    LocationManager getLocationManager();
    CommentManager getCommentManager();
    VoieManager getVoieManager();
}
