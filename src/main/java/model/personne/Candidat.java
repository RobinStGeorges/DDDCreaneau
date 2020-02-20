package model.personne;

import commun.DtoCandidat;

import java.util.UUID;

public class Candidat implements Personnes {
    String name;
    String statutRecrutement;
    String specialite;
    String id;

    public Candidat(DtoCandidat dtoCandidat) {
        this.name = dtoCandidat.name;
        this.id = UUID.randomUUID().toString();
        this.specialite = dtoCandidat.specialite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatutRecrutement() {
        return statutRecrutement;
    }

    public void setStatutRecrutement(String statutRecrutement) {
        this.statutRecrutement = statutRecrutement;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
