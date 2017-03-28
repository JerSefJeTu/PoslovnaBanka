package models;

/***********************************************************************
 * Module:  FIZICKO.java
 * Author:  Aleksa
 * Purpose: Defines the Class FIZICKO
 ***********************************************************************/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class FIZICKO extends KLIJENT {

    @Column(nullable = false)
    public String IME;
    @Column(nullable = false)
    public String PREZIME;
    @Column(nullable = false, unique = true)
    public double JMBG;


    public FIZICKO() {
    }

    public FIZICKO(MESTO mesto, String ADRESA, String TELEFON, String FAX, String e_MAIL, String IME, String PREZIME, double JMBG) {
    	this.mesto=mesto;
      this.ADRESA = ADRESA;
      this.TELEFON = TELEFON;
      this.FAX = FAX;
      this.E_MAIL = e_MAIL;
      this.IME = IME;
      this.PREZIME = PREZIME;
      this.JMBG = JMBG;
   }

	

    
    
}