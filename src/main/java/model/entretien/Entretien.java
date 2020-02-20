package model.entretien;

import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoRecruteur;
import commun.DtoSalle;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.personne.Personnes;
import model.salle.Salle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Entretien {
    Creneau creneau;
    Salle salle;
    String id;
    String statut;
    Personnes recruteur ;
    Personnes candidat;
    String canceledReason;

    public Entretien(DtoCreneau dtoCreneau, DtoSalle dtoSalle, DtoRecruteur dtoRecruteur, DtoCandidat dtoCandidat) throws Exception {
        this.creneau = new Creneau(dtoCreneau.date, dtoCreneau.heureDebut, dtoCreneau.heureFin);
        this.salle = new Salle(dtoSalle.numSalle, dtoSalle.etage);
        this.id = UUID.randomUUID().toString();
        this.statut = "created";
        this.candidat = new Candidat(dtoCandidat);
        this.recruteur = new Recruteur(dtoRecruteur);
    }


    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(LocalDateTime date, int heureDebut, int heureFin) throws Exception {
        this.creneau = new Creneau(date, heureDebut, heureFin);
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


    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }



    public void cancel(String reason){
        statut="canceled";
        canceledReason = reason;
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
}
