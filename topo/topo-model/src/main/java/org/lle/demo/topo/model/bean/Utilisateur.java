package org.lle.demo.topo.model.bean;

public class Utilisateur {

    private static Integer id;
    private String username;
    private String email;
    private String password;

    public Utilisateur(){

    }

    public Utilisateur(int id) {
    }

    public Utilisateur(String user, String mail, String password) {
        setUsername(user);
        setEmail(mail);
        setPassword(password);

    }

    public static Integer getId() {
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

    @Override
    public String toString() {
        return "Utilisateur{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
