
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreneauTest{

    @Test
    public void dateDébutIsBeforeDateFinSHouldReturnTrue() {
        LocalDateTime date = LocalDateTime.of( 2014, Month.APRIL, 16,0,0);
        int heureDebut = 12;
        int heureFin = 13;
        Creneau creneau = new Creneau(date, heureDebut, heureFin);
        assertEquals(creneau.getValid(), true);
    }

    @Test
    public void dateDébutIsBeforeDateFinSHouldReturnFalse() {
        LocalDateTime date = LocalDateTime.of( 2014, Month.APRIL, 16,0,0);
        int heureDebut = 14;
        int heureFin = 13;
        Creneau creneau = new Creneau(date, heureDebut, heureFin);
        assertEquals(creneau.getValid(), false);
    }

    @Test
    public void dateIsOnWeekendShouldReturnfalse(){
        LocalDateTime date = LocalDateTime.of( 2020, Month.FEBRUARY, 22,0,0);
        Creneau creneau = new Creneau(date, 12, 13);
        assertEquals(creneau.getValid(), false);
    }

    @Test
    public void dateIsOnWeekShouldReturntrue(){
        LocalDateTime date = LocalDateTime.of( 2020, Month.FEBRUARY, 22,0,0);
        Creneau creneau = new Creneau(date, 12, 13);
        assertEquals(creneau.getValid(), false);
    }

}