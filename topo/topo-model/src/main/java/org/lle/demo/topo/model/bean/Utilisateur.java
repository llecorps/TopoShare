package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

public class Utilisateur {

    private  Integer id;
    private String username;
    private String email;
    private String password;

    @NotNull
    private Utilisateur responsable;

    public Utilisateur(){

    }

    public Utilisateur(int pId) {
        id = pId;
    }
/*
    public Utilisateur(String user, String mail, String password , Utilisateur responsable) {
        this.username = user;
        this.email = mail;
        this.password = password;
        this.responsable = responsable;

    }
*/
    public Utilisateur(String username, String email, String password) {
       this.username = username;
       this.email = email;
       this.password = password;

    }

    public  Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String pUsername) {
        username = pUsername;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String pEmail) {
        email = pEmail;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String pPassword) {
        password = pPassword;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }
    public void setResponsable(Utilisateur pResponsable) {
        responsable = pResponsable;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
