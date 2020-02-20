package commun;

import java.time.LocalDateTime;

public class DtoCreneau {
    public LocalDateTime date;
    public int heureDebut;
    public int heureFin;

    public DtoCreneau(LocalDateTime date, int heureDebut, int heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

}
