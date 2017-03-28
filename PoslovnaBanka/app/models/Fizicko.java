package models;

/***********************************************************************
 * Module:  Fizicko.java
 * Author:  Aleksa
 * Purpose: Defines the Class Fizicko
 ***********************************************************************/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Fizicko extends Klijent {

    @Column(nullable = false)
    public String ime;
    @Column(nullable = false)
    public String prezime;
    @Column(nullable = false, unique = true)
    public int JMBG;


    public Fizicko() {
    }

    public Fizicko(Mesto mesto, String adresa, String telefon, String fax, String eMail, String ime, String prezime, int JMBG) {
    	super();
    	this.mesto=mesto;
      this.adresa = adresa;
      this.telefon = telefon;
      this.fax = fax;
      this.eMail = eMail;
      this.ime = ime;
      this.prezime = prezime;
      this.JMBG = JMBG;
   }
}