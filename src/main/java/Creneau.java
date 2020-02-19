import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Creneau {
    LocalDateTime date;
    int heureDebut;
    int heureFin;
    Boolean isValid ;

    Creneau(LocalDateTime date, int heureDebut, int heureFin){
        String dayOfWeek = date.getDayOfWeek().name();
        if(heureDebut<heureFin && !dayOfWeek.equals("SUNDAY") && !dayOfWeek.equals("SATURDAY")){
            this.date = date;
            this.heureDebut = heureDebut;
            this.heureFin = heureFin;
            isValid = true;
        }
        else{
            isValid = false;
        }
    }

    public Boolean getValid() {
        return isValid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }
}
