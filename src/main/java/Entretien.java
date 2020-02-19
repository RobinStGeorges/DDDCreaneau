import java.time.LocalDateTime;

public class Entretien {
    Creneau creneau;
    int salle;

    public Entretien(Creneau creneau, int salle) {
        this.creneau = creneau;
        this.salle = salle;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(LocalDateTime date, int heureDebut, int heureFin) {
        this.creneau = new Creneau(date, heureDebut, heureFin);
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }
}
