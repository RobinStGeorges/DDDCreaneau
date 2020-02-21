package model.salle;

public class Salle {
    int salleID;
    public int numSalle;
    public int etage;
    public int capaciteMax;
    public boolean hasProjecteur;

    public Salle(int numSalle, int etage, int capaciteMax, boolean hasProjecteur) {
        this.numSalle = numSalle;
        this.etage = etage;
        this.capaciteMax = capaciteMax;
        this.hasProjecteur = hasProjecteur;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public boolean isHasProjecteur() {
        return hasProjecteur;
    }

    public void setHasProjecteur(boolean hasProjecteur) {
        this.hasProjecteur = hasProjecteur;
    }

    public int getSalleID() {
        return salleID;
    }

    public void setSalleID(int salleID) {
        this.salleID = salleID;
    }
}
