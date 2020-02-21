package model.entretien;

import commun.DtoCreneau;

import java.time.LocalDateTime;

class Creneau {
    public LocalDateTime date;
    public int heureDebut;
    public int heureFin;

    Creneau(DtoCreneau dtoCreneau) throws Exception {
        String dayOfWeek = dtoCreneau.date.getDayOfWeek().name();

        if (dtoCreneau.heureDebut>=dtoCreneau.heureFin){
            throw new Exception("L'heure de début est après l'heure de fin !");
        }
        else if(dayOfWeek.equals("SUNDAY") || dayOfWeek.equals("SATURDAY")){
            throw new Exception("Impossible de prendre rendez-vous le Week-end !");
        }
        else if(dtoCreneau.heureDebut>22 || dtoCreneau.heureDebut < 6){
            throw new Exception("Impossible de prendre rendez vous entre 22h et 6h !");
        }
        else{
            this.date = dtoCreneau.date;
            this.heureDebut = dtoCreneau.heureDebut;
            this.heureFin = dtoCreneau.heureFin;
        }

    }

    /* getters / setters */
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
