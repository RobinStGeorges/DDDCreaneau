package model.salle;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Reservations {

    public ArrayList<Reservation> TrouverReservationsSelonSalle(int salleID);
}
