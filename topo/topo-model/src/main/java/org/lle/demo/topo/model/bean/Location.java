package org.lle.demo.topo.model.bean;

import com.sun.istack.internal.NotNull;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Location {

    private Integer id;
    private String datedeb;
    private String datefin;
    private Integer idUtilisateur;
    private Integer idTopo;
    @NotNull
    private Utilisateur responsable;
    @NotNull
    private Topo topo;

    public Location(){

    }

    public Location(int id) {
    }

    public Location(String datedeb, String datefin, Integer idUtilisateur, Integer idTopo ){
        this.datedeb = datedeb;
        this.datefin = datefin;
        this.idUtilisateur = idUtilisateur;
        this.idTopo = idTopo;
    }

    public Location(String datedeb, String datefin, Utilisateur responsable, Topo topo ) {

        this.datedeb = datedeb;
        this.datefin = datefin;
        this.responsable = responsable;
        this.topo = topo;
    }

    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo pTopo) {
        topo = pTopo;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }
    public void setResponsable(Utilisateur pResponsable) {
        responsable = pResponsable;
    }

    public  Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    public  Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Integer pIdUtilisateur) {
        idUtilisateur = pIdUtilisateur;
    }

    public  Integer getIdTopo() {
        return idTopo;
    }
    public void setIdTopo(Integer pIdTopo) {
        idTopo = pIdTopo;
    }

    public String getDatedeb() {
        return datedeb;
    }
    public void setDatedeb(String pDatedeb) {
        datedeb = pDatedeb;
    }

    public String getDatefin() {
        return datefin;
    }
    public void setDatefin(String pDatefin) {
        datefin = pDatefin;
    }

    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("Date de début=").append(datedeb)
                .append(vSEP).append("Date de fin=").append(datefin)
                .append(vSEP).append("Utilisateur=").append(responsable)
                .append(vSEP).append("Topo=").append(topo)
                .append("}");
        return vStB.toString();
    }

}
