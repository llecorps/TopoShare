package org.lle.demo.topo.consumer.dao.rowmapper;

import org.lle.demo.topo.model.bean.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by esspressoh on 07.07.18.
 */
public class TopoRM implements RowMapper<Topo> {

    public Topo mapRow(ResultSet pRS, int rowNum) throws SQLException {

        Topo vTopo = new Topo(pRS.getInt("idtopo"));


        vTopo.setId(pRS.getInt("idtopo"));
        vTopo.setLibelle(pRS.getString("libelle"));
        vTopo.setLieu(pRS.getString("lieu"));
        vTopo.setIdUtilisateur(pRS.getInt("utilisateur_idutilisateur"));
        vTopo.setIdLocation(pRS.getInt("location_utilisateur_idutilisateur"));
        return vTopo;
    }
}
