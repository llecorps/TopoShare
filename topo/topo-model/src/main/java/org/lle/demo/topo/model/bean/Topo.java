package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Topo {

    private Integer id;
    private String libelle;
    private String lieu;
    private String secteur;
    private String statut;
    private Integer idLocation;
    private Integer idUtilisateur;

    @NotNull
    private Utilisateur responsable;


    @NotNull
    private Topo topoguide;

    public Topo() {

    }

    public Topo(Integer pId) {
        id = pId;
    }

    public Topo(String libelle, String lieu, String secteur, String statut, Utilisateur responsable ) {

        this.libelle = libelle;
        this.lieu = lieu;
        this.secteur = secteur;
        this.statut = statut;
        this.responsable = responsable;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        this.id = pId;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
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

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }
    public void setResponsable(Utilisateur pResponsable) {
        responsable = pResponsable;
    }

    public Topo getTopoguide() {
        return topoguide;
    }

    public void setTopoguide(Topo topoguide) {
        this.topoguide = topoguide;
    }

    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("Idtopo=").append(id)
                .append(vSEP).append("libelle=").append(libelle)
                .append(vSEP).append("lieu=\"").append(lieu).append('"')
                .append(vSEP).append("secteur=").append(secteur)
                .append(vSEP).append("statut=").append(statut)
                .append(vSEP).append("location=").append(idLocation)
                .append(vSEP).append("utilisateur=").append(idUtilisateur)
                .append(vSEP).append("responsable=").append(responsable)
                .append("}");
        return vStB.toString();
    }
}
