package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.UtilisateurRM;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by esspressoh on 19.06.18.
 */
public class UtilisateurDao {

    private JdbcTemplate jdbcTemplate;

    protected List<Utilisateur> vListUtilisateur = new ArrayList<>();

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveUtilisateur(Utilisateur vUtilisateur){

        String query="insert into utilisateur (username, email, password) values('"+vUtilisateur.getUsername()+"','"+vUtilisateur.getEmail()+"','"+vUtilisateur.getPassword()+"')";

        return jdbcTemplate.update(query);
    }


    public List<Utilisateur> getlistUtilisateur() {

        String vSQL="select * from utilisateur";

        RowMapper<Utilisateur> vRowMapper = new UtilisateurRM();

        vListUtilisateur = jdbcTemplate.query(vSQL, vRowMapper);

        ListIterator listIterator = vListUtilisateur.listIterator();
        while(listIterator.hasNext()) {
            Utilisateur u = (Utilisateur)listIterator.next();
            System.out.println("Liste DAO="+u);
        }

        return vListUtilisateur;

    }
}
