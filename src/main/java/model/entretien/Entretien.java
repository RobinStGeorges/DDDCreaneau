package model.entretien;

import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoSalle;
import infrastructure.Recrutement;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.personne.Personnes;
import model.salle.Reservation;
import model.salle.Salle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Entretien {
    public Creneau creneau;
    String id;
    String statut;
    Personnes recruteur ;
    Personnes candidat;
    String canceledReason;
    //SalleID
    int salleId;
    int recrutementID;

    public Entretien(DtoCreneau dtoCreneau, DtoCandidat dtoCandidat, Recrutement recrutement) throws Exception {
        this.creneau = new Creneau(dtoCreneau);
        this.id = UUID.randomUUID().toString();
        this.statut = "created";
        this.candidat = new Candidat(dtoCandidat);
        if(this.candidat.getSpecialite() == null){
            this.recruteur = recrutement.recruteurs.get(0);
        }
        else{
            for(Recruteur unRecruteur : recrutement.recruteurs){
                if(unRecruteur.getSpecialite().equals(this.candidat.getSpecialite())){
                    this.recruteur = unRecruteur;
                }
            }
        }
        if(this.recruteur == null){
            throw new Exception("Il n'y a pas de recruteur disponible");
        }

    }

/*Setters / getters */
    public Creneau getCreneau() {
        return creneau;
    }

    public LocalDateTime retournerDateDuCreaneau(Creneau creneau){
        return creneau.getDate();
    }

    public int retournerHeureDebutDuCreneau(Creneau creneau){
        return creneau.heureDebut;
    }

    public int retournerHeureFinDuCreneau(Creneau creneau){
        return creneau.heureFin;
    }

    public void setCreneau(DtoCreneau creneau) throws Exception {
        this.creneau = new Creneau(creneau);
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

    public int getSalleId() {
        return salleId;
    }


}
