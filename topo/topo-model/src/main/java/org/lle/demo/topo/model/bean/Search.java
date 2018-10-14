package org.lle.demo.topo.model.bean;

/**
 * Created by esspressoh on 08.10.18.
 */
public class Search {

    public String mot;
    public String champ;
    public String statut;
    public String notation;

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }
    public String getMot() {
        return mot;
    }
    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getChamp() {
        return champ;
    }
    public void setChamp(String champ) {
        this.champ = champ;
    }

    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Search(){}

    public Search(String mot, String champ, String statut, String notation) {
        this.mot = mot;
        this.champ = champ;
        this.statut = statut;
        this.notation = notation;
    }


    // ==================== Méthodes ====================
    @Override
    public String toString() {
        final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
        final String vSEP = ", ";
        vStB.append(" {")
                .append("mot=").append(mot)
                .append(vSEP).append("champ=").append(champ)
                .append(vSEP).append("statut=").append(statut)
                .append(vSEP).append("notation=").append(notation)
                .append("}");
        return vStB.toString();
    }

}
