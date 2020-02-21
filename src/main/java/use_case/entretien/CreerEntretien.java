package use_case.entretien;


import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoRecruteur;
import commun.DtoSalle;
import infrastructure.Recrutement;
import model.entretien.Entretien;

public class CreerEntretien {

    public String creerEntretien(DtoCreneau dtoCreneau, DtoCandidat dtoCandidat, Recrutement recrutement) throws Exception {

        Entretien entretien = new Entretien( dtoCreneau, dtoCandidat, recrutement);
        // Salle
        recrutement.entretiens.add(entretien);
        return entretien.getId();
    }
}
