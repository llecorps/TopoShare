package org.lle.demo.topo.business.contract.manager;

import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

import java.util.List;

/**
 * Created by esspressoh on 12.07.18.
 */
public interface TopoManager {


    public List ListTopo();

    /**
     * Renvoie le topo demandé
     *
     * @param id l'identifiant du projet
     * @return Le {@link Topo}
     * @throws NotFoundException Si le projet n'est pas trouvé
     */

    Topo detailTopo(Integer id) throws NotFoundException;

    /**
     * Ajoute un nouveau {@link Topo}
     * @param pTopo -
     * @throws FunctionalException Projet invalide
     * @throws TechnicalException Erreur technique
     */
    void ajoutTopo(String libelle, String lieu, Utilisateur utilisateur) throws FunctionalException, TechnicalException;



}
