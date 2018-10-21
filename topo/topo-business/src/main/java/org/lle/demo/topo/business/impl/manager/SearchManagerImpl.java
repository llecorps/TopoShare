package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.SearchManager;
import org.lle.demo.topo.consumer.dao.TopoDao;
import org.lle.demo.topo.model.bean.Search;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;

/**
 * Created by esspressoh on 13.10.18.
 */
@Named
public class SearchManagerImpl implements SearchManager {

    private  Search newSearch;
    private Topo newTopo;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    //SearchDao searchdao=(SearchDao)ctx.getBean("searchdao");
    TopoDao topodao=(TopoDao)ctx.getBean("topodao");

    public SearchManagerImpl() {


    }

    public SearchManagerImpl(Search newSearch) {

        this.newSearch = newSearch;
    }

    @Override
    public Topo searchMot(String mot, String champ, String statut, String notation) throws FunctionalException, TechnicalException {


        newTopo=topodao.getLibelleTopo(mot, statut, notation);

        return newTopo;
    }



}
