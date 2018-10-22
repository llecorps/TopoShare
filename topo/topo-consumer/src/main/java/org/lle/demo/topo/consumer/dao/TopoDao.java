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

        String query="insert into topo (libelle,lieu,secteur,statut,utilisateur_idutilisateur) values('"+vTopo.getLibelle()+"','"+vTopo.getLieu()+"','"+vTopo.getSecteur()+"','"+vTopo.getStatut()+"','"+vTopo.getResponsable().getId()+"')";

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
        }

    public Topo getLibelleTopo( String mot, String statut, String notation){
        String vSQL="select * from topo where libelle ='"+mot+"' AND statut='"+statut+"'";
        RowMapper<Topo> vRowMapper = new TopoRM();
        return jdbcTemplate.queryForObject(vSQL, vRowMapper);
    }

}
