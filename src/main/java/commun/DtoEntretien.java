package commun;

import model.personne.Personnes;
import model.salle.Salle;

public class DtoEntretien {

    DtoCreneau creneau;
    Salle salle;
    String id;
    String statut;
    Personnes recruteur ;
    Personnes candidat;
    String canceledReason;

    public DtoEntretien(DtoCreneau creneau, Salle salle, String id, String statut, Personnes recruteur, Personnes candidat, String canceledReason) {
        this.creneau = creneau;
        this.salle = salle;
        this.id = id;
        this.statut = statut;
        this.recruteur = recruteur;
        this.candidat = candidat;
        this.canceledReason = canceledReason;
    }

    public DtoCreneau getCreneau() {
        return creneau;
    }

    public void setCreneau(DtoCreneau creneau) {
        this.creneau = creneau;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Personnes getRecruteur() {
        return recruteur;
    }

    public void setRecruteur(Personnes recruteur) {
        this.recruteur = recruteur;
    }

    public Personnes getCandidat() {
        return candidat;
    }

    public void setCandidat(Personnes candidat) {
        this.candidat = candidat;
    }

    public String getCanceledReason() {
        return canceledReason;
    }

    public void setCanceledReason(String canceledReason) {
        this.canceledReason = canceledReason;
    }
}
