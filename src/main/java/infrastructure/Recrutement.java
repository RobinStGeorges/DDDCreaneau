package infrastructure;

import model.entretien.Entretien;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.salle.Reservation;
import model.salle.Salle;
import model.salle.Salles;

import java.util.ArrayList;

public class Recrutement implements Salles {

    int RecrutementID;

    ArrayList<Entretien> entretiens = new ArrayList<Entretien>();

    ArrayList<Candidat> candidats = new ArrayList<Candidat>();

    ArrayList<Recruteur> recruteurs = new ArrayList<Recruteur>();

    ArrayList<Salle> salles = new ArrayList<Salle>();

    ArrayList<Reservation> reservations = new ArrayList<Reservation>();


    public Recrutement() {
    }


    @Override
    public ArrayList<Salle> getAllSalles() {
        return null;
    }

    @Override
    public Salle getSalleByID(int id) {
        return null;
    }
}
