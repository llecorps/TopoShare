package org.lle.demo.topo.business.impl;

import org.lle.demo.topo.business.impl.manager.UtilisateurManagerImpl;
import org.lle.demo.topo.model.bean.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by esspressoh on 19.06.18.
 */
public class Test {
    public static void main(String[] args) {

       UtilisateurManagerImpl newUtilisateur = new UtilisateurManagerImpl();
        //newUtilisateur.ajoutUtilisateur("mike","mike@mail.com","password");
        List<Utilisateur> list = new ArrayList<>() ;
        list = newUtilisateur.ListeUtilisateur();

        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //TopoManagerImpl newTopo = new TopoManagerImpl();
        //newTopo.ajoutTopo("colima2","la ravine2", 2);

        //LocationManagerImpl newLocation = new LocationManagerImpl();
        //newLocation.ajoutLocation("01.01.2018","31.06.2018", 1, 1);

    }
}
