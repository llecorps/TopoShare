package org.lle.demo.topo.business.contract.manager;

import org.lle.demo.topo.model.bean.Location;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.NotFoundException;

import java.util.List;

/**
 * Created by esspressoh on 21.08.18.
 */
public interface LocationManager {


    void ajoutLocation(String dateDeb, String dateFin, Utilisateur utilisateur, Topo topo);

    public List ListeLocation();

    Location detailLocation(Integer id) throws NotFoundException;

}
