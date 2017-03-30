package models;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/***********************************************************************
 * Module:  Pravno.java
 * Author:  Aleksa
 * Purpose: Defines the Class Pravno
 ***********************************************************************/
@Entity
public class Pravno extends Klijent {

   @Column(nullable = false, unique = true)
   public String naziv;
   @Column(nullable = false, unique = true)
   public double PIB;
   @Column(nullable = false, unique = true)
   public double maticniBroj;
   @ManyToOne
   public Delatnost delatnost;
   @OneToOne
   public Klijent klijent;

   public Pravno() {
   }

   public Pravno(String ADRESA, String telefon, String fax, String eMail, String naziv, double PIB, double maticniBroj, Delatnost delatnost) {
      super();
	   this.adresa = ADRESA;
      this.telefon = telefon;
      this.fax = fax;
      this.eMail = eMail;
      this.naziv = naziv;
      this.PIB = PIB;
      this.maticniBroj = maticniBroj;
      this.delatnost = delatnost;
   }
}