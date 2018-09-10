package org.lle.demo.topo.consumer.dao.rowmapper;

import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by esspressoh on 06.09.18.
 */
public class IDutilisateurRM implements RowMapper<Utilisateur> {

    public Utilisateur mapRow(ResultSet pRS, int rowNum) throws SQLException {

        Utilisateur vUtilisateur = new Utilisateur(pRS.getInt("max"));


        vUtilisateur.setId(pRS.getInt("max"));


        return vUtilisateur;
    }


}
