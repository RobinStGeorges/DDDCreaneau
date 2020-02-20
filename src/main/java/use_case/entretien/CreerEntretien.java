package use_case.entretien;


import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.time.LocalDateTime;

public class CreerEntretien {

    public void creerEntretien(LocalDateTime date, int heureDebut, int heureFin, int salle, int etage,  String nameCandidat, String nameRecruteur) throws Exception {
        Entretien entretien = new Entretien( date, heureDebut, heureFin, salle, etage, "créé", nameRecruteur, nameCandidat);

    }
}
