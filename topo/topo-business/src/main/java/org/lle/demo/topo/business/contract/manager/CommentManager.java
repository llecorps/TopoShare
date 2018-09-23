package org.lle.demo.topo.business.contract.manager;


import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;

public interface CommentManager {

    void addComment(String decription, Topo topoId, Utilisateur userId) throws FunctionalException, TechnicalException;
}
