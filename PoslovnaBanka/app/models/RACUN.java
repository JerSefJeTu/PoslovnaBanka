package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  RACUN.java
 * Author:  Aleksa
 * Purpose: Defines the Class RACUN
 ***********************************************************************/
@Entity
public class RACUN extends Model {
   @Column(nullable = false, unique = true)
   public String BROJ_RACUNA;
   @Column(nullable = false, unique = true)
   public double ID_RACUNA;
   @Column(nullable = false)
   public GASENJE_RACUNA gASENJE_RACUNA;
   @OneToMany(mappedBy = "rACUN")
   public java.util.Collection<DNEVNO_STANJE_RACUNA> dNEVNO_STANJE_RACUNA;
   @ManyToOne
   public KLIJENT kLIJENT;
   @ManyToOne
   public BANKA bANKA;

   public RACUN() {
   }

   public RACUN(String BROJ_RACUNA, double ID_RACUNA, GASENJE_RACUNA gASENJE_RACUNA, Collection<DNEVNO_STANJE_RACUNA> dNEVNO_STANJE_RACUNA, KLIJENT kLIJENT, BANKA bANKA) {
      this.BROJ_RACUNA = BROJ_RACUNA;
      this.ID_RACUNA = ID_RACUNA;
      this.gASENJE_RACUNA = gASENJE_RACUNA;
      this.dNEVNO_STANJE_RACUNA = dNEVNO_STANJE_RACUNA;
      this.kLIJENT = kLIJENT;
      this.bANKA = bANKA;
   }
}