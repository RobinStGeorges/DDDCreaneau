package model.entretien;

import model.salle.Salle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Entretien {
    Creneau creneau;
    Salle salle;
    String id;
    String statut;
    Recruteur recruteur ;
    Candidat candidat;
    String canceledReason;

    public Entretien(LocalDateTime date, int heureDebut, int heureFin, int salle, int etage, String statut, String recruteur, String candidat) throws Exception {
        this.creneau = new Creneau(date, heureDebut, heureFin);
        this.salle = new Salle(salle, etage);
        this.id = UUID.randomUUID().toString();
        this.statut = statut;
        this.candidat = new Candidat(candidat);
        this.recruteur = new Recruteur(recruteur);
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

    public boolean confirm(){
        if(statut.equals("comfirmed")){
            return false;
        }
        if(statut.equals("canceled")){
            return false;
        }
        statut="comfirmed";
        return true;
    }

    public void cancel(String reason){
        statut="canceled";
        canceledReason = reason;
    }
}
