package org.lle.demo.topo.consumer.dao;

import org.lle.demo.topo.model.bean.Commentaire;
import org.springframework.jdbc.core.JdbcTemplate;

public class CommentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int saveComment(Commentaire vCommentaire){

        String query="insert into commentaire (description,topo_idtopo,utilisateur_idutilisateur) values('"+vCommentaire.getDescription()+"','"+vCommentaire.getTopoguide().getId()+"','"+vCommentaire.getTopoguide().getId()+"')";


        return jdbcTemplate.update(query);
    }


}
