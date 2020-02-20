package model.entretien;

import java.time.LocalDateTime;

class Creneau {
    LocalDateTime date;
    int heureDebut;
    int heureFin;

    Creneau(LocalDateTime date, int heureDebut, int heureFin) throws Exception {
        String dayOfWeek = date.getDayOfWeek().name();

        if (heureDebut>=heureFin){
            throw new Exception("L'heure de début est après l'heure de fin !");
        }
        else if(dayOfWeek.equals("SUNDAY") || dayOfWeek.equals("SATURDAY")){
            throw new Exception("Impossible de prendre rendez-vous le Week-end !");
        }
        else if(heureDebut>22 || heureDebut < 6){
            throw new Exception("Impossible de prendre rendez vous entre 22h et 6h !");
        }
        else{
            this.date = date;
            this.heureDebut = heureDebut;
            this.heureFin = heureFin;
        }

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
