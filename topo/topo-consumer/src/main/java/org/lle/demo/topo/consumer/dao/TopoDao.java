package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.model.bean.Topo;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by esspressoh on 26.06.18.
 */
public class TopoDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveTopo(Topo vTopo){

        String query="insert into topo (libelle,lieu,utilisateur_idutilisateur) values('"+vTopo.getLibelle()+"','"+vTopo.getLieu()+"','"+vTopo.getIdUtilisateur()+"')";

        return jdbcTemplate.update(query);
    }

}
