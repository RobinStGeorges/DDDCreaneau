package infrastructure;

import model.entretien.Entretien;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.salle.Salle;

import java.util.ArrayList;

public class Recrutement {
    ArrayList<Entretien> entretiens = new ArrayList<Entretien>();

    ArrayList<Candidat> candidats = new ArrayList<Candidat>();

    ArrayList<Recruteur> recruteurs = new ArrayList<Recruteur>();

    ArrayList<Salle> salles = new ArrayList<Salle>();

    private static Recrutement instance = null;

    private Recrutement() {
    }

    public static final Recrutement getInstance() {
        if (instance == null) {
            instance = new Recrutement();
            return instance;
        } else {
            return instance;
        }
    }

    public ArrayList<Entretien> getEntretiens() {
        return entretiens;
    }

    public void setEntretiens(ArrayList<Entretien> entretiens) {
        this.entretiens = entretiens;
    }

    public ArrayList<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(ArrayList<Candidat> candidats) {
        this.candidats = candidats;
    }

    public ArrayList<Recruteur> getRecruteurs() {
        return recruteurs;
    }

    public void setRecruteurs(ArrayList<Recruteur> recruteurs) {
        this.recruteurs = recruteurs;
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(ArrayList<Salle> salles) {
        this.salles = salles;
    }
}
