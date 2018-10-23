package org.lle.demo.topo.business.contract.manager;

import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

import java.util.List;

/**
 * Created by esspressoh on 13.10.18.
 */
public interface SearchManager {

    List<Topo> searchMot (String Mot, String champ) throws FunctionalException, TechnicalException;
}
