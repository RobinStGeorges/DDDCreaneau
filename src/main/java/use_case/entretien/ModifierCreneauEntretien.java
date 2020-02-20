package use_case.entretien;

import model.entretien.Entretien;

import java.time.LocalDateTime;

public class ModifierCreneauEntretien {

    public void modifierCreaneauEntretien(Entretien entretien, LocalDateTime date, int heureDebut, int heureFin) throws Exception {
        entretien.setCreneau(date, heureDebut, heureFin);
    }
}
