package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
/***********************************************************************
 * Module:  GASENJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class GASENJE_RACUNA
 ***********************************************************************/
@Entity
public class GASENJE_RACUNA {
   @Column(nullable = false, unique = true)
   public double ID_GASENJA;
   @Column(nullable = false)
   public Date DATUM_GASENJA;
   @Column(nullable = false)
   public String PRENOS_NA_RACUN;
   
   @ManyToOne
   public RACUN rACUN;

   public GASENJE_RACUNA() {
   }

   public GASENJE_RACUNA(double ID_GASENJA, Date DATUM_GASENJA, String PRENOS_NA_RACUN, RACUN rACUN) {
      this.ID_GASENJA = ID_GASENJA;
      this.DATUM_GASENJA = DATUM_GASENJA;
      this.PRENOS_NA_RACUN = PRENOS_NA_RACUN;
      this.rACUN = rACUN;
   }
}