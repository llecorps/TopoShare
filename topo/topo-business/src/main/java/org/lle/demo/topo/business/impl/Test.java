package org.lle.demo.topo.business.impl;

import org.lle.demo.topo.business.impl.manager.LocationManagerImpl;
import org.lle.demo.topo.model.bean.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by esspressoh on 19.06.18.
 */
public class Test {
    public static void main(String[] args) {

       //UtilisateurManagerImpl newUtilisateur = new UtilisateurManagerImpl();
        //newUtilisateur.ajoutUtilisateur("mike","mike@mail.com","password");
        //List<Utilisateur> list = new ArrayList<>() ;
        //list = newUtilisateur.ListeUtilisateur();



        //TopoManagerImpl newTopo = new TopoManagerImpl();
        //newTopo.ajoutTopo("colima2","la ravine2", 2);
        //List<Topo> list = new ArrayList<>() ;
        //list = newTopo.ListTopo();



        LocationManagerImpl newLocation = new LocationManagerImpl();
        //newLocation.ajoutLocation("01-07-2018","31-07-2018", 1, 5);
        List<Location> list = new ArrayList<>() ;
        list = newLocation.ListeLocation();


        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
