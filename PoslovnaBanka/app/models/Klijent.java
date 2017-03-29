package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Collection;
/***********************************************************************
 * Module:  Klijent.java
 * Author:  Aleksa
 * Purpose: Defines the Class Klijent
 ***********************************************************************/
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//anotacija iznad sprecava da se u tabeli Klijent
//pojave i atributi iz klasa koje nasledjuju klasu Klijent
public class Klijent extends Model {

    @OneToMany(mappedBy = "klijent")
    public java.util.Collection<Racun> racun;
    @Column(nullable = false)
    public String adresa;
    @Column(nullable = false)
    public String telefon;
    @Column(nullable = false)
    public String fax;
    @Column(nullable = false)
    public String eMail;
    @Column(nullable = false)
    public String username;
    @Column(nullable = false)
    public String password;

    @ManyToOne
    public Mesto mesto;


   public Klijent() {
   }

	public Klijent(Collection<Racun> racun, String adresa, String telefon, String fax, String eMail, Mesto mesto) {
		super();
		this.racun = racun;
		this.adresa = adresa;
		this.telefon = telefon;
		this.fax = fax;
		this.eMail = eMail;
		this.mesto = mesto;
	}

   
}