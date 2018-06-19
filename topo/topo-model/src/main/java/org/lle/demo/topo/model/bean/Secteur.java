package org.lle.demo.topo.model.bean;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Secteur {

    private static Integer id;
    private String libelle;
    private String statut;
    private static Integer idTopo;


    public Secteur(){

    }

    public Secteur(int id) {
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

    public String getStatut() {
        return statut;
    }
    public void setStatut(String pStatut) {
        statut = pStatut;
    }

    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("Libelle=").append(libelle)
                .append(vSEP).append("Statut=").append(statut)
                .append(vSEP).append("Topo=").append(idTopo)
                .append("}");
        return vStB.toString();
    }
}
