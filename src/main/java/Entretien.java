import java.time.LocalDateTime;

public class Entretien {
    Creneau creneau;
    Salle salle;
    int id;
    String statut;

    public Entretien(Creneau creneau, Salle salle, int id, String statut) {
        this.creneau = creneau;
        this.salle = salle;
        this.id = id;
        this.statut = statut;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
