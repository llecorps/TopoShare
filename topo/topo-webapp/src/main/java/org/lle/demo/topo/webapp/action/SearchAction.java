package org.lle.demo.topo.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.demo.topo.model.bean.Search;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Voie;
import org.lle.demo.topo.model.bean.exception.FunctionalException;
import org.lle.demo.topo.model.bean.exception.NotFoundException;
import org.lle.demo.topo.model.bean.exception.TechnicalException;
import org.lle.demo.topo.webapp.WebappHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 07.10.18.
 */
public class SearchAction extends ActionSupport {


    // ----- Paramètres en entrée

    public Search search;
    public List<String> champTopo;
    public List<String> champSelect;
    public Topo topo;
    private List<Voie> listVoie;

    public List<Voie> getListVoie() {
        return listVoie;
    }

    public void setListVoie(List<Voie> listVoie) {
        this.listVoie = listVoie;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public List<String> getChampTopo() {
        return champTopo;
    }
    public void setChampTopo(List<String> champTopo) {
        this.champTopo = champTopo;
    }

    public Search getSearch() {
        return search;
    }
    public void setSearch(Search search) {
        this.search = search;
    }

    public SearchAction(){

        champTopo = new ArrayList<String>();
        champTopo.add("libelle");
        champTopo.add("lieu");
        champTopo.add("secteur");

        champSelect = new ArrayList<String>();
        champSelect.add("ouverte");
        champSelect.add("fermée");

    }



    public String doSearch() throws NotFoundException {
        String vResult = ActionSupport.INPUT;

        if (this.search != null) {
            if (!this.hasErrors()) {
                try {
            WebappHelper.getManagerFactory().getSearchManager().searchMot(this.search.getMot(), this.search.getChamp(), this.search.getStatut(), this.search.getNotation());
                    vResult = ActionSupport.SUCCESS;
                    this.addActionMessage("Recherche effectuée");
                } catch (FunctionalException pEx) {
                    // Sur erreur fonctionnelle on reste sur la page de saisie
                    // et on affiche un message d'erreur
                    this.addActionError(pEx.getMessage());

                } catch (TechnicalException pEx) {
                    // Sur erreur technique on part sur le result "error"
                    this.addActionError(pEx.getMessage());
                    vResult = ActionSupport.ERROR;
                }
        }
        }

        if (vResult.equals(ActionSupport.INPUT)) {
            this.listVoie = WebappHelper.getManagerFactory().getVoieManager().listVoie();
        }


        return vResult;
    }



}
