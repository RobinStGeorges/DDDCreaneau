package use_case.entretien;

import model.entretien.Entretien;

public class ComfirmerEntretien {
    public boolean comfirmerEntretien(Entretien entretien){
        String statut = entretien.getStatut();
        if(statut.equals("comfirmed")){
            return false;
        }
        if(statut.equals("canceled")){
            return false;
        }
        entretien.setStatut("comfirmed");
        return true;
    }
}
