package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.Date;
/***********************************************************************
 * Module:  GASENJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class GASENJE_RACUNA
 ***********************************************************************/
@Entity
public class GASENJE_RACUNA extends Model {

   @Column(nullable = false)
   public Date DATUM_GASENJA;
   @Column(nullable = false)
   public String PRENOS_NA_RACUN;
   @OneToOne //dovrsi vezu 
   public RACUN rACUN;

   public GASENJE_RACUNA() {
   }

   public GASENJE_RACUNA(Date DATUM_GASENJA, String PRENOS_NA_RACUN, RACUN rACUN) {
      this.DATUM_GASENJA = DATUM_GASENJA;
      this.PRENOS_NA_RACUN = PRENOS_NA_RACUN;
      this.rACUN = rACUN;
   }


}