package infrastructure;

import model.entretien.Entretien;
import model.personne.Candidat;
import model.personne.Recruteur;
import model.salle.Reservation;
import model.salle.Reservations;
import model.salle.Salle;
import model.salle.Salles;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Recrutement implements Salles, Reservations {

    int RecrutementID;

    public ArrayList<Entretien> entretiens = new ArrayList<Entretien>();

    public ArrayList<Candidat> candidats = new ArrayList<Candidat>();

    public ArrayList<Recruteur> recruteurs = new ArrayList<Recruteur>();

    public ArrayList<Salle> salles = new ArrayList<Salle>();

    public ArrayList<Reservation> reservations = new ArrayList<Reservation>();


    public Recrutement() {
    }


    @Override
    public ArrayList<Salle> ToutesLesSalles() {
        return salles;
    }

    @Override
    public Salle trouverSalleParIdentifiant(int id) throws Exception {

        for(Salle salle : salles){
            if(salle.getSalleID() == id){
                return salle;
            }
        }
        throw new Exception("Il n'y a pas de salle avec cet ID");
    }

    @Override
    public Salle trouverSalleLibreSelonDate(LocalDateTime date) throws Exception {
        for(Salle salle : salles){
            ArrayList<Reservation> reservationsDeLaSalle = TrouverReservationsSelonSalle(salle.getSalleID());
            for (Reservation reservation : reservationsDeLaSalle){
                if(reservation.getDate() != date){
                    return salle;
                }
            }
        }

        throw new Exception("Il n'y apas de salle de libre actuelement");
    }

    @Override
    public ArrayList<Reservation> TrouverReservationsSelonSalle(int salleID) {
        ArrayList<Reservation> reservationsDeLaSalle = new ArrayList<Reservation>();
        for(Reservation reservation : reservations){
            if(reservation.getIdentifiantSalle() == salleID){
                reservationsDeLaSalle.add(reservation);
            }
        }
        return reservationsDeLaSalle;
    }
}
