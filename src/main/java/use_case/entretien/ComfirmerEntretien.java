package use_case.entretien;

import model.entretien.Entretien;

public class ComfirmerEntretien {
    public boolean comfirmerEntretien(Entretien entretien) throws Exception {
        String statut = entretien.getStatut();
        if(statut.equals("comfirmed")){
            throw new Exception("entretiens deja confirmé");
        }
        if(statut.equals("canceled")){
            throw new Exception("entretiens deja annulé");
        }
        entretien.setStatut("comfirmed");
        return true;
    }
}
