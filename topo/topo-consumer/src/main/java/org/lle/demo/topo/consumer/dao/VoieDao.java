package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.VoieRM;
import org.lle.demo.topo.model.bean.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by esspressoh on 30.09.18.
 */
public class VoieDao {

    private Voie voie;
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Voie getVoie(Integer id){

        String vSQL="select * from voie where idvoie ="+id;
        RowMapper<Voie> vRowMapper = new VoieRM();
        return jdbcTemplate.queryForObject(vSQL, vRowMapper);

    }

    public int saveVoie(Voie vVoie){

        String query="insert into voie (libelle, notation, hauteur, largeur, idtopo ) values('" + vVoie.getLibelle() + "','" + vVoie.getNotation() + "','" + vVoie.getHauteur() + "','" + vVoie.getLargeur() + "','" + vVoie.getTopoguide().getId() + "')";
        return jdbcTemplate.update(query);
    }
}
