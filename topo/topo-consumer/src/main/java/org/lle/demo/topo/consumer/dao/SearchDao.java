package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.TopoRM;
import org.lle.demo.topo.model.bean.Topo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by esspressoh on 14.10.18.
 */
public class SearchDao {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Topo getTopo(String mot, String champ){


        String vSQL="select * from topo where idtopo ="+mot;

        RowMapper<Topo> vRowMapper = new TopoRM();


        return jdbcTemplate.queryForObject(vSQL, vRowMapper);



    }
}
