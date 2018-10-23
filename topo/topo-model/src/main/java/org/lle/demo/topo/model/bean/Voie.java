package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Voie {

    private static Integer id;
    private String libelle;
    private String notation;
    private String hauteur;
    private String largeur;
    private static Integer idTopo;

    @NotNull
    private Topo topoguide;

    public Voie(){

    }

    public Voie(int id) {
    }

    public Voie(String libelle, String notation, String hauteur, String largeur, Topo topoguide   ){

        this.libelle = libelle;
        this.notation = notation;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.topoguide = topoguide;

    }

    public Topo getTopoguide() {
        return topoguide;
    }

    public void setTopoguide(Topo topoguide) {
        this.topoguide = topoguide;
    }

    public static Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    public static Integer getIdTopo() {
        return idTopo;
    }
    public void setIdTopo(Integer pIdTopo) {
        idTopo = pIdTopo;
    }

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String pLibelle) {
        libelle = pLibelle;
    }

    public String getNotation() {
        return notation;
    }
    public void setNotation(String pNotation) {
        notation = pNotation;
    }

    public String getHauteur() {
        return hauteur;
    }
    public void setHauteur(String pHauteur) {
        hauteur = pHauteur;
    }

    public String getLargeur() {
        return largeur;
    }
    public void setLargeur(String pLargeur) {
        largeur = pLargeur;
    }

    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("Libelle=").append(libelle)
                .append(vSEP).append("Notation=").append(notation)
                .append(vSEP).append("Hauteur=").append(hauteur)
                .append(vSEP).append("Largeur=").append(largeur)
                .append(vSEP).append("Topo=").append(idTopo)
                .append("}");
        return vStB.toString();
    }
}
