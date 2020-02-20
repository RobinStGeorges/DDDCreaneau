package model.entretien;

import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoSalle;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.personne.Personnes;
import model.salle.Salle;

import java.util.ArrayList;
import java.util.UUID;

public class Entretien {
    Creneau creneau;
    Salle salle;
    String id;
    String statut;
    Personnes recruteur ;
    Personnes candidat;
    String canceledReason;

    public Entretien(DtoCreneau dtoCreneau, DtoSalle dtoSalle, ArrayList<Recruteur> recruteurs, DtoCandidat dtoCandidat) throws Exception {
        this.creneau = new Creneau(dtoCreneau);
        this.salle = new Salle(dtoSalle.numSalle, dtoSalle.etage);
        this.id = UUID.randomUUID().toString();
        this.statut = "created";
        this.candidat = new Candidat(dtoCandidat);
        if(this.candidat.getSpecialite() == null){
            this.recruteur = recruteurs.get(0);
        }
        else{
            for(Recruteur unRecruteur : recruteurs){
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

    public void setCreneau(DtoCreneau creneau) throws Exception {
        this.creneau = new Creneau(creneau);
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
