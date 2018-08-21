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

    private Topo newTopo;



    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveTopo(Topo vTopo){

        String query="insert into topo (libelle,lieu,utilisateur_idutilisateur) values('"+vTopo.getLibelle()+"','"+vTopo.getLieu()+"','"+vTopo.getResponsable().getId()+"')";

        return jdbcTemplate.update(query);
    }

    public List<Topo> getlistTopo() {

        String vSQL="select * from topo";

        RowMapper<Topo> vRowMapper = new TopoRM();

        vListTopo = jdbcTemplate.query(vSQL, vRowMapper);

        return vListTopo;

    }

    public Topo getTopo(Integer id){


        String vSQL="select * from topo where idtopo ="+id;

        RowMapper<Topo> vRowMapper = new TopoRM();


        return jdbcTemplate.queryForObject(vSQL, vRowMapper);

        /*

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("Id", 1);
        return jdbcTemplate.queryForObject("select * from topo where idtopo = :Id", namedParameters, String.class);
        */

        /*

        Topo vTopo = new Topo();
        vTopo.setId(Id);

        String SELECT_BY_ID = "select * from topo where idtopo = :id";

        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(vTopo);
         return jdbcTemplate.queryForObject(SELECT_BY_ID, namedParameters, Topo.class);

       */

        //String query = "SELECT * FROM topo WHERE idtopo = ?";
        //String query = "SELECT * FROM topo WHERE idtopo = 4";
        //Topo topos = jdbcTemplate.queryForObject(
          //      query, new Object[] { id }, new TopoRM());

       // String query="";

        //return jdbcTemplate.update(query);


        }


}
