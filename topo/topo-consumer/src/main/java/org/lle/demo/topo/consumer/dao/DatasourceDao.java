package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.model.bean.Location;
import org.lle.demo.topo.model.bean.Topo;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by esspressoh on 01.07.18.
 */
public class DatasourceDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveTopo(Topo vTopo){

        String query="insert into topo (libelle,lieu,utilisateur_idutilisateur) values('"+vTopo.getLibelle()+"','"+vTopo.getLieu()+"','"+vTopo.getIdUtilisateur()+"')";

        return jdbcTemplate.update(query);
    }

    public int saveUtilisateur(Utilisateur vUtilisateur){

        String query="insert into utilisateur (username, email, password) values('"+vUtilisateur.getUsername()+"','"+vUtilisateur.getEmail()+"','"+vUtilisateur.getPassword()+"')";

        return jdbcTemplate.update(query);
    }

    public int saveLocation(Location vLocation){

        String query="insert into location (datedeb, datefin, utilisateur_idutilisateur, topo_idtopo) values('"+vLocation.getDatedeb()+"','"+vLocation.getDatefin()+"','"+vLocation.getIdUtilisateur()+"','"+vLocation.getIdTopo()+"')";

        return jdbcTemplate.update(query);
    }

}
