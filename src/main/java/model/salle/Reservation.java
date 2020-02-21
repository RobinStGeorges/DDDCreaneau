package model.salle;

import java.time.LocalDateTime;

public class Reservation {
    int identifiantEntretien;
    LocalDateTime date;
    int identifiantSalle;

    public Reservation(int identifiantEntretien, LocalDateTime date, int identifiantSalle) {
        this.identifiantEntretien = identifiantEntretien;
        this.date = date;
        this.identifiantSalle = identifiantSalle;
    }

    public int getIdentifiantEntretien() {
        return identifiantEntretien;
    }

    public void setIdentifiantEntretien(int identifiantEntretien) {
        this.identifiantEntretien = identifiantEntretien;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getIdentifiantSalle() {
        return identifiantSalle;
    }

    public void setIdentifiantSalle(int identifiantSalle) {
        this.identifiantSalle = identifiantSalle;
    }
}
