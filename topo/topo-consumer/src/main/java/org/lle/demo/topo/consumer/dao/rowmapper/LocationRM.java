package org.lle.demo.topo.consumer.dao.rowmapper;

import org.lle.demo.topo.model.bean.Location;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by esspressoh on 07.07.18.
 */
public class LocationRM implements RowMapper<Location> {

    public Location mapRow(ResultSet pRS, int rowNum) throws SQLException {

        Location vLocation = new Location(pRS.getInt("idlocation"));

        vLocation.setId(pRS.getInt("idlocation"));
        vLocation.setDatedeb(pRS.getString("datedeb"));
        vLocation.setDatefin(pRS.getString("datefin"));
        vLocation.setIdUtilisateur(pRS.getInt("utilisateur_idutilisateur"));
        vLocation.setIdTopo(pRS.getInt("topo_idtopo"));
        return vLocation;
    }


}
