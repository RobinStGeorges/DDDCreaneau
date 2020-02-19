package entretien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDateTime;
import java.time.Month;

public class CreneauTest{

    @Test
    public void dateDébutIsBeforeDateFinSHouldReturnTrue() throws Exception {
        try{
            LocalDateTime date = LocalDateTime.of( 2014, Month.APRIL, 16,0,0);
            int heureDebut = 12;
            int heureFin = 13;
            Creneau creneau = new Creneau(date, heureDebut, heureFin);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    @Test
    public void dateDébutIsBeforeDateFinSHouldReturnException() {
        LocalDateTime date = LocalDateTime.of( 2014, Month.APRIL, 16,0,0);
        int heureDebut = 14;
        int heureFin = 13;
        assertThrows(Exception.class,
                ()->{
                    Creneau creneau = new Creneau(date, heureDebut, heureFin);
        });
    }

    @Test
    public void dateIsOnWeekendShouldReturnException(){
        LocalDateTime date = LocalDateTime.of( 2020, Month.FEBRUARY, 22,0,0);
        assertThrows(Exception.class,
                ()->{
                    Creneau creneau = new Creneau(date, 12, 13);
                });
    }

    @Test
    public void dateIsOnWeekShouldReturntrue() throws Exception {
        LocalDateTime date = LocalDateTime.of( 2020, Month.FEBRUARY, 21,0,0);
        Creneau creneau = new Creneau(date, 12, 13);
    }

    @Test
    public void hourIsTooLateSHouldReturnException(){
        LocalDateTime date = LocalDateTime.of( 2020, Month.FEBRUARY, 22,0,0);
        assertThrows(Exception.class,
                ()->{
                    Creneau creneau = new Creneau(date, 23, 24);
                });
    }

}