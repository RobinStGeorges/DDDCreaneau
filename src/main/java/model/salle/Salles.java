package model.salle;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Salles {
    public ArrayList<Salle> ToutesLesSalles();

    public Salle trouverSalleParIdentifiant(int id) throws Exception;

    public Salle trouverSalleLibreSelonDate(LocalDateTime date) throws Exception;
}
