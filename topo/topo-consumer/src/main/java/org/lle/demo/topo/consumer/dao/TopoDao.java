package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.TopoRM;
import org.lle.demo.topo.model.bean.Topo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 26.06.18.
 */
public class TopoDao {

    private JdbcTemplate jdbcTemplate;

    protected List<Topo> vListTopo = new ArrayList<>();

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveTopo(Topo vTopo){

        String query="insert into topo (libelle,lieu,utilisateur_idutilisateur) values('"+vTopo.getLibelle()+"','"+vTopo.getLieu()+"','"+vTopo.getIdUtilisateur()+"')";

        return jdbcTemplate.update(query);
    }

    public List<Topo> getlistTopo() {

        String vSQL="select * from topo";

        RowMapper<Topo> vRowMapper = new TopoRM();

        vListTopo = jdbcTemplate.query(vSQL, vRowMapper);

        return vListTopo;

    }

}
