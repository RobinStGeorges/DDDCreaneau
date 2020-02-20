package use_case.entretien;


import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoRecruteur;
import commun.DtoSalle;
import infrastructure.Recrutement;
import model.entretien.Entretien;

public class CreerEntretien {

    public void creerEntretien(DtoCreneau dtoCreneau, DtoSalle dtoSalle, DtoCandidat dtoCandidat, DtoRecruteur dtoRecruteur) throws Exception {
        Entretien entretien = new Entretien( dtoCreneau,  dtoSalle,  dtoRecruteur,  dtoCandidat);
        Recrutement.getInstance().getEntretiens().add(entretien);
    }
}
