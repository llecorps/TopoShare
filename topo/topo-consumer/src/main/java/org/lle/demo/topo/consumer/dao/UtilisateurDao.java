package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 * Created by esspressoh on 19.06.18.
 */
public class UtilisateurDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveUtilisateur(Utilisateur vUtilisateur){


        String query="insert into utilisateur values('"+vUtilisateur.getId()+"','"+vUtilisateur.getUsername()+"','"+vUtilisateur.getEmail()+"','"+vUtilisateur.getPassword()+"')";

        return jdbcTemplate.update(query);
    }

}
