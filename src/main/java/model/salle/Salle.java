package model.salle;

public class Salle {
    int numDeSalle;
    int numEtage;

    public Salle(int numDeSalle, int numEtage) {
        this.numDeSalle = numDeSalle;
        this.numEtage = numEtage;
    }

    public int getNumDeSalle() {
        return numDeSalle;
    }

    public void setNumDeSalle(int numDeSalle) {
        this.numDeSalle = numDeSalle;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }
}
