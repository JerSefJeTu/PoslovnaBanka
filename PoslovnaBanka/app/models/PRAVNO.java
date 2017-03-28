package models;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
/***********************************************************************
 * Module:  PRAVNO.java
 * Author:  Aleksa
 * Purpose: Defines the Class PRAVNO
 ***********************************************************************/
@Entity
public class PRAVNO extends KLIJENT {

   @Column(nullable = false, unique = true)
   public String NAZIV;
   @Column(nullable = false, unique = true)
   public double PIB;
   @Column(nullable = false, unique = true)
   public double MATICNI_BROJ;
   @ManyToOne
   public DELATNOST dELATNOST;

   public PRAVNO() {
   }

   public PRAVNO(String ADRESA, String TELEFON, String FAX, String e_MAIL, String NAZIV, double PIB, double MATICNI_BROJ, DELATNOST dELATNOST) {
      this.ADRESA = ADRESA;
      this.TELEFON = TELEFON;
      this.FAX = FAX;
      E_MAIL = e_MAIL;
      this.NAZIV = NAZIV;
      this.PIB = PIB;
      this.MATICNI_BROJ = MATICNI_BROJ;
      this.dELATNOST = dELATNOST;
   }
}