package model.entretien;

import commun.DtoCandidat;
import commun.DtoCreneau;
import commun.DtoRecruteur;
import infrastructure.Recrutement;
import model.personne.Recruteur;
import model.salle.Salle;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import use_case.entretien.AnnulerEntretien;
import use_case.entretien.ComfirmerEntretien;
import use_case.entretien.CreerEntretien;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class EntretienTest {
    @Test
    public void isValidShouldReturnTrue() throws Exception {
        try{
            DtoCreneau  dtoCreneau = new DtoCreneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
            CreerEntretien creerEntretien = new CreerEntretien();
            DtoCandidat dtoCandidat = new DtoCandidat("John", "java");
            DtoRecruteur dtoRecruteur = new DtoRecruteur("Tom", "Java");
            Recrutement recrutement = new Recrutement();
            creerEntretien.creerEntretien(dtoCreneau, dtoCandidat, recrutement);
        }
        catch (Exception e){
            System.out.println(e);
        }
  }

    @Test
    public void twoDifferentEntretienShouldReturnTrue() throws Exception {
        DtoCreneau creneau = new DtoCreneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        CreerEntretien creerEntretien = new CreerEntretien();
        Recrutement recrutement = new Recrutement();
        DtoCandidat dtoCandidat1= new DtoCandidat("John", "Java");
        DtoCandidat dtoCandidat2= new DtoCandidat("Tom", "Java");
        recrutement.recruteurs.add(new Recruteur(new DtoRecruteur("Jerry", "Java")));
        creerEntretien.creerEntretien(creneau,dtoCandidat1, recrutement );
        creerEntretien.creerEntretien(creneau, dtoCandidat2, recrutement);


        assertNotEquals(recrutement.entretiens.get(0).id, recrutement.entretiens.get(1).id);
    }

    @Test
    public void tryToConfirmCanceledEntretienShouldReturnExeption() throws Exception {
        DtoCreneau creneau = new DtoCreneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        CreerEntretien creerEntretien = new CreerEntretien();
        Recrutement recrutement = new Recrutement();
        DtoCandidat dtoCandidat= new DtoCandidat("John", "Java");
        recrutement.recruteurs.add(new Recruteur(new DtoRecruteur("Jerry", "Java")));
        String entretienID = creerEntretien.creerEntretien(creneau,dtoCandidat, recrutement );
        Entretien entretien = recrutement.ChercherEntretienParID(entretienID);
        AnnulerEntretien annulerEntretien = new AnnulerEntretien();
        annulerEntretien.annulerEntretien(entretien, "test");
        ComfirmerEntretien comfirmerEntretien = new ComfirmerEntretien();

        assertThrows(Exception.class,
                ()->{
                    comfirmerEntretien.comfirmerEntretien(entretien);
                });

    }
/*
    @Test
    public void tryToConfirmComfirmedEntretienShouldReturnFalse() throws Exception {
        Creneau creneau = new Creneau(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14);
        Salle salle = new Salle(2,1); // il faudrait que 2 model.entretien ai pas lieu meme salle
        Entretien entretien = new Entretien(LocalDateTime.of(2020, Month.FEBRUARY, 3,0,0), 13,14, 2,1, "created", "Tom", "Jerry");
        ComfirmerEntretien comfirmerEntretien = new ComfirmerEntretien();
        comfirmerEntretien.comfirmerEntretien(entretien);
        assertEquals(false, comfirmerEntretien.comfirmerEntretien(entretien));
    }
*/
}
