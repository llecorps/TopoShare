package org.lle.demo.topo.business.contract;


import org.lle.demo.topo.business.contract.manager.TopoManager;
import org.lle.demo.topo.business.contract.manager.UtilisateurManager;

/**
 * Factory des Managers
 */
public interface ManagerFactory {


    UtilisateurManager getUtilisateurManager();

    TopoManager getTopoManager();
}
