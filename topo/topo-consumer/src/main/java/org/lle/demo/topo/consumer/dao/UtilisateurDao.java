package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.consumer.dao.rowmapper.IDutilisateurRM;
import org.lle.demo.topo.consumer.dao.rowmapper.UtilisateurRM;
import org.lle.demo.topo.model.bean.Utilisateur;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;


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

        return vListUtilisateur;

    }

    public Utilisateur getUtilisateur(int id){


        String vSQL="select * from utilisateur where idutilisateur ="+id;

        RowMapper<Utilisateur> vRowMapper = new UtilisateurRM();


        return jdbcTemplate.queryForObject(vSQL, vRowMapper);


    }


    public Utilisateur getUtilisateur(String user) {
        String vSQL="select MAX(idutilisateur) from utilisateur";

        RowMapper<Utilisateur> vRowMapper = new IDutilisateurRM();
        return jdbcTemplate.queryForObject(vSQL, vRowMapper);


    }
    public Utilisateur getUtilisateur(String login, String password)  {

        String simpleQuote="'";

        String vSQL="select * from utilisateur where username="+simpleQuote+login+simpleQuote;
            RowMapper<Utilisateur> vRowMapper = new UtilisateurRM();
            try {
            return jdbcTemplate.queryForObject(vSQL, vRowMapper);
        }catch(EmptyResultDataAccessException se){
            se.printStackTrace();
        }
        Utilisateur vUtilisateur = new Utilisateur();
        vUtilisateur.setUsername("notdefined");
        vUtilisateur.setPassword("notdefined");
        return vUtilisateur;

    }
}
