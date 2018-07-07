package org.lle.demo.topo.consumer.dao.rowmapper;

import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by esspressoh on 03.07.18.
 */
public class UtilisateurRM implements RowMapper<Utilisateur> {
    public Utilisateur mapRow(ResultSet pRS, int rowNum) throws SQLException {

        Utilisateur vUtilisateur = new Utilisateur(pRS.getInt("idutilisateur"));


        vUtilisateur.setId(pRS.getInt("idutilisateur"));
        vUtilisateur.setUsername(pRS.getString("username"));
        vUtilisateur.setEmail(pRS.getString("email"));
        vUtilisateur.setPassword(pRS.getString("password"));

        return vUtilisateur;
    }
}
