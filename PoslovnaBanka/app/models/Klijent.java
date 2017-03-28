package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  Klijent.java
 * Author:  Aleksa
 * Purpose: Defines the Class Klijent
 ***********************************************************************/
@Entity
public class Klijent extends Model {

    @Column(nullable = false, unique = true)
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