package org.lle.demo.topo.business.impl.manager;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.CommentManager;
import org.lle.demo.topo.consumer.dao.CommentDao;
import org.lle.demo.topo.model.bean.Commentaire;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;

@Named
public class CommentManagerImpl implements CommentManager {

    private String description;
    private Integer topoId, userID;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    CommentDao commentdao=(CommentDao)ctx.getBean("commentdao");




    @Override
    public void addComment(String description, Topo topo, Utilisateur user) throws FunctionalException, TechnicalException {

        int status=commentdao.saveComment(new Commentaire(description, topo, user));
        System.out.println(status);
    }
}
