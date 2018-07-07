package org.lle.demo.topo.model.bean;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Topo {

    private static Integer id;
    private String libelle;
    private String lieu;
    private static Integer idUtilisateur;
    private static Integer idLocation;

    public Topo(){

    }

    public Topo(int id) {
        this.id = id;
    }

    public Topo(String libelle, String lieu, Integer idUtilisateur ) {

        this.libelle = libelle;
        this.lieu = lieu;
        this.idUtilisateur = idUtilisateur;
    }

    public static Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    public static Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Integer pIdUtilisateur) {
        idUtilisateur = pIdUtilisateur;
    }

    public static Integer getIdLocation() {
        return idLocation;
    }
    public void setIdLocation(Integer pIdLocation) {
        idLocation = pIdLocation;
    }

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String pLibelle) {
        libelle = pLibelle;
    }

    public String getLieu() {
        return lieu;
    }
    public void setLieu(String pLieu) {
        lieu = pLieu;
    }

    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("libelle=").append(libelle)
                .append(vSEP).append("lieu=\"").append(lieu).append('"')
                .append(vSEP).append("location=").append(idLocation)
                .append(vSEP).append("utilisateur=").append(idUtilisateur)
                .append("}");
        return vStB.toString();
    }
}
