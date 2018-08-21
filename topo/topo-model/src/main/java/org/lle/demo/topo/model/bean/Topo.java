package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Topo {

    private Integer id;
    private String libelle;
    private String lieu;
    private Integer idLocation;

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    private Integer idUtilisateur;

    @NotNull
    private Utilisateur responsable;

    public Topo(){

    }

    public Topo(String libelle, String lieu, int idUtilisateur, int idLocation) {

        this.libelle = libelle;
        this.lieu = lieu;
        this.idUtilisateur = idUtilisateur;
        this.idLocation = idLocation;
    }

    public Topo(int id) {
        this.id = id;
    }

    public Topo(String libelle, String lieu, Utilisateur responsable ) {

        this.libelle = libelle;
        this.lieu = lieu;
        this.responsable = responsable;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        this.id = pId;
    }


    public Integer getIdLocation() {
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

    public Utilisateur getResponsable() {
        return responsable;
    }
    public void setResponsable(Utilisateur pResponsable) {
        responsable = pResponsable;
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
                .append(vSEP).append("utilisateur=").append(responsable)
                .append("}");
        return vStB.toString();
    }
}
