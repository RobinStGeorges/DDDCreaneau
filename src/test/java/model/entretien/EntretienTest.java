package model.entretien;

import model.salle.Salle;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import use_case.entretien.ComfirmerEntretien;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EntretienTest {
    @Test
    public void isValidShouldReturnTrue() throws Exception {
        try{
            Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
            Salle salle = new Salle(2,1);
            Entretien entretien = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");
        }
        catch (Exception e){
            System.out.println(e);
        }
  }

    @Test
    public void twoDifferentEntretienShouldReturnTrue() throws Exception {
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 model.entretien ai pas lieu meme salle
        Entretien entretien1 = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");
        Entretien entretien2 = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");

        assertNotEquals(entretien1.getId(), entretien2.getId());
    }

    @Test
    public void tryToConfirmCanceledEntretienShouldReturnFalse() throws Exception {
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 model.entretien ai pas lieu meme salle
        Entretien entretien = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");

        entretien.cancel("testing");
        ComfirmerEntretien comfirmerEntretien = new ComfirmerEntretien();
        assertEquals(comfirmerEntretien.comfirmerEntretien(entretien), false);
    }

    @Test
    public void tryToConfirmComfirmedEntretienShouldReturnFalse() throws Exception {
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 model.entretien ai pas lieu meme salle
        Entretien entretien = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");
        ComfirmerEntretien comfirmerEntretien = new ComfirmerEntretien();
        comfirmerEntretien.comfirmerEntretien(entretien);
        assertEquals(false, comfirmerEntretien.comfirmerEntretien(entretien));
    }

}
