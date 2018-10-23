package org.lle.demo.topo.business.impl.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.demo.topo.business.contract.manager.VoieManager;
import org.lle.demo.topo.consumer.dao.VoieDao;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Voie;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 30.09.18.
 */
@Named
public class VoieManagerImpl implements VoieManager {

    private String libelle, notation, hauteur, largeur;
    private Integer topoId;
    private Voie voie;
    protected List<Voie> listVoie;

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TopoManagerImpl.class);

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    VoieDao voiedao=(VoieDao)ctx.getBean("voiedao");



    @Override
    public void addVoie(String libelle, String notation, String hauteur, String largeur, Topo topoId) throws FunctionalException, TechnicalException {

        int status=voiedao.saveVoie(new Voie(libelle,  notation, hauteur, largeur, topoId));
        System.out.println(status);

    }

    @Override
    public Voie detailVoie(Integer id) throws NotFoundException {

        voie = voiedao.getVoie(id);
        return voie;
    }

    @Override
    public List<Voie> listVoie() {
        listVoie = new ArrayList<>() ;
        listVoie=voiedao.getlistVoie();

        return listVoie;
    }
}
