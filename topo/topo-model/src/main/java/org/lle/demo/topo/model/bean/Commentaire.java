package org.lle.demo.topo.model.bean;

/**
 * Created by esspressoh on 18.06.18.
 */
public class Commentaire {

    private static Integer id;
    private String description;
    private static Integer idUtilisateur;
    private static Integer idLocation;

    public Commentaire(){

    }

    public Commentaire(int id) {
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
                .append(vSEP).append("location=").append(idLocation)
                .append(vSEP).append("utilisateur=").append(idUtilisateur)
                .append("}");
        return vStB.toString();
    }
}
