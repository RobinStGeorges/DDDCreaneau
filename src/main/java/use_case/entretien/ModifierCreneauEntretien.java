package use_case.entretien;

import commun.DtoCreneau;
import model.entretien.Entretien;

import java.time.LocalDateTime;

public class ModifierCreneauEntretien {

    public void modifierCreaneauEntretien(Entretien entretien, DtoCreneau dtoCreneau) throws Exception {
        entretien.setCreneau(dtoCreneau);
    }
}
