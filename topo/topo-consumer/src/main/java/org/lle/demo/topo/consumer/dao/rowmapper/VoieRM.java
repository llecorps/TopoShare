package org.lle.demo.topo.consumer.dao.rowmapper;

import org.lle.demo.topo.model.bean.Voie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by esspressoh on 30.09.18.
 */
public class VoieRM implements RowMapper<Voie> {

    public Voie mapRow(ResultSet pRS, int rowNum) throws SQLException {

        Voie vVoie = new Voie(pRS.getInt("idvoie"));


        vVoie.setId(pRS.getInt("idvoie"));
        vVoie.setLibelle(pRS.getString("libelle"));
        vVoie.setNotation(pRS.getString("notation"));
        vVoie.setHauteur(pRS.getString("hauteur"));
        vVoie.setLargeur(pRS.getString("largeur"));
        vVoie.setIdTopo(pRS.getInt("idTopo"));
        return vVoie;
    }
}
