package recrutement;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Creneau {
    LocalDateTime date;
    int heureDebut;
    int heureFin;
    Boolean isValid ;

    Creneau(LocalDateTime date, int heureDebut, int heureFin){
        String dayOfWeek = date.getDayOfWeek().name();

        if (heureDebut>=heureFin){
            isValid = false;
        }
        else if(dayOfWeek.equals("SUNDAY") || dayOfWeek.equals("SATURDAY")){
            isValid = false;
        }
        else if(heureDebut>22 || heureDebut < 6){
            isValid = false;
        }
        else{
            this.date = date;
            this.heureDebut = heureDebut;
            this.heureFin = heureFin;
            isValid = true;
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
