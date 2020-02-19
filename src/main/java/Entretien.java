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

    public Entretien(Creneau creneau, Salle salle,  String statut, Recruteur recruteur, Candidat candidat) {
        this.creneau = creneau;
        this.salle = salle;
        this.id = UUID.randomUUID().toString();
        this.statut = statut;
        this.candidat = candidat;
        this.recruteur = recruteur;
    }

    public boolean isValid(){
        if(salle.numDeSalle <0){
            return false;
        }
        if(salle.numEtage<0){
            return false;
        }
        if(!creneau.isValid){
            return false;
        }
        return true;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(LocalDateTime date, int heureDebut, int heureFin) {
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

    public void confirm(){
        statut="comfirmed";
    }

    public void cancel(String reason){
        statut="canceled";
        canceledReason = reason;
    }
}
