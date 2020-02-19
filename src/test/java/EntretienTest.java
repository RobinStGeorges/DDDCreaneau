
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import recrutement.*;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EntretienTest {
    @Test
    public void isValidShouldReturnTrue(){
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1);
        Entretien entretien = new Entretien(creneau, salle, "created", new Recruteur("Tom"), new Candidat("Jerry"));
        assertEquals(entretien.isValid(), true);
    }

    @Mock
    Entretien entretien;

    @Test
    public void twoDifferentEntretienShouldReturnTrue(){
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 entretien ai pas lieu meme salle
        Entretien entretien1 = new Entretien(creneau, salle, "created", new Recruteur("Tom"), new Candidat("Jerry"));
        Entretien entretien2 = new Entretien(creneau, salle, "created", new Recruteur("Tom"), new Candidat("Jerry"));
        assertNotEquals(entretien1.getId(), entretien2.getId());
    }

    @Test
    public void tryToConfirmCanceledEntretienShouldReturnFalse(){
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 entretien ai pas lieu meme salle
        Entretien entretien = new Entretien(creneau, salle, "created", new Recruteur("Tom"), new Candidat("Jerry"));
        entretien.cancel("testing");
        assertEquals(entretien.confirm(), false);
    }

    @Test
    public void tryToConfirmComfirmedEntretienShouldReturnFalse(){
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 entretien ai pas lieu meme salle
        Entretien entretien = new Entretien(creneau, salle, "created", new Recruteur("Tom"), new Candidat("Jerry"));
        entretien.confirm();
        assertEquals(entretien.confirm(), false);
    }

}
