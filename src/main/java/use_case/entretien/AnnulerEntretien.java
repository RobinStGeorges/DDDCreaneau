package use_case.entretien;

import model.entretien.Entretien;

public class AnnulerEntretien {
    public void annulerEntretien(Entretien entretien, String raison){
        entretien.setStatut("canceled");

    }
}
