package org.lle.demo.topo.business.contract.manager;

import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Voie;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

import java.util.List;

/**
 * Created by esspressoh on 30.09.18.
 */
public interface VoieManager {

    void addVoie(String libelle, String notation, String hauteur, String largeur,  Topo topoId) throws FunctionalException, TechnicalException;

    Voie detailVoie(Integer id) throws NotFoundException;

    List<Voie> listVoie();

}
