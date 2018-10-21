package org.lle.demo.topo.business.contract.manager;

import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

/**
 * Created by esspressoh on 13.10.18.
 */
public interface SearchManager {

    Topo searchMot (String Mot, String champ, String statut, String notation) throws FunctionalException, TechnicalException;
}
