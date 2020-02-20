package commun;

public class DtoSalle {
    public int numSalle;
    public int etage;
    public int capaciteMax;
    public boolean hasProjecteur;

    public DtoSalle(int numSalle, int etage, int capaciteMax, boolean hasProjecteur) {
        this.numSalle = numSalle;
        this.etage = etage;
        this.capaciteMax = capaciteMax;
        this.hasProjecteur = hasProjecteur;
    }


}
