package org.lle.demo.topo.model.bean;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Location {

    private static Integer id;
    private String datedeb;
    private String datefin;
    private static Integer idUtilisateur;
    private static Integer idTopo;

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
                .append(vSEP).append("Utilisateur=").append(idUtilisateur)
                .append(vSEP).append("Topo=").append(idTopo)
                .append("}");
        return vStB.toString();
    }

}
