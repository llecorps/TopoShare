package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.LocationRM;
import org.lle.demo.topo.model.bean.Location;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esspressoh on 07.07.18.
 */
public class LocationDao {

    private JdbcTemplate jdbcTemplate;

    protected List<Location> vListLocation = new ArrayList<>();

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveLocation(Location vLocation){

        String query="insert into location (datedeb, datefin, utilisateur_idutilisateur, topo_idtopo) values('"+vLocation.getDatedeb()+"','"+vLocation.getDatefin()+"','"+vLocation.getIdUtilisateur()+"','"+vLocation.getIdTopo()+"')";

        return jdbcTemplate.update(query);
    }

    public List<Location> getlistLocation() {

        String vSQL="select * from location";

        RowMapper<Location> vRowMapper = new LocationRM();

        vListLocation = jdbcTemplate.query(vSQL, vRowMapper);

        return vListLocation;

    }

}
