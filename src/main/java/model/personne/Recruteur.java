package model.personne;

import commun.DtoRecruteur;

public class Recruteur implements Personnes {
    String name;
    String specialite;

    public Recruteur(DtoRecruteur dtoRecruteur) {
        this.name = dtoRecruteur.name;
        this.specialite = dtoRecruteur.specialite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}