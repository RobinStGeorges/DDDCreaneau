
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class EntretienTest {
    @Test
    public void isValidShouldReturnTrue(){
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Entretien entretien = new Entretien(creneau, 12);
        assertEquals(entretien.isValid(), true);
    }

}
