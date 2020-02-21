package model.salle;

import java.util.ArrayList;

public interface Salles {
    public ArrayList<Salle> getAllSalles();

    public Salle getSalleByID(int id);
}
