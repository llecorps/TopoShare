package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Commentaire {

    private static Integer id;
    private String description;
    private static Integer idUtilisateur;
    private static Integer idTopo;


    @NotNull
    private Utilisateur responsable;

    @NotNull
    private Topo topoguide;

    public Commentaire(){

    }

    public Commentaire(int id) {
    }


    public Commentaire(String description, Topo topoguide, Utilisateur responsable) {
        this.description = description;
        this.topoguide = topoguide;
        this.responsable = responsable;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }

    public void setResponsable(Utilisateur responsable) {
        this.responsable = responsable;
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

    public static Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Integer pIdUtilisateur) {
        idUtilisateur = pIdUtilisateur;
    }

    public static Integer getIdTopo() {
        return idTopo;
    }
    public void setIdTopo(Integer pIdTopo) {
        idTopo = pIdTopo;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String pDescription) {
        description = pDescription;
    }


    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("Description=").append(description)
                .append(vSEP).append("topoguide=").append(topoguide)
                .append(vSEP).append("responsable=").append(responsable)
                .append("}");
        return vStB.toString();
    }
}
