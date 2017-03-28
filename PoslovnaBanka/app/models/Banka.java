package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.Collection;
/***********************************************************************
 * Module:  Banka.java
 * Author:  Aleksa
 * Purpose: Defines the Class Banka
 ***********************************************************************/
@Entity
public class Banka extends Model {

    @Column(nullable = false, unique = true)
    public double sifraBanke;
    @Column(nullable = false, unique = true)
    public String nazivBanke;
    @Column(nullable = false, unique = true)
    public String adresaBanke;
    @Column(nullable = false, unique = true)
    public String telefonBanke;
    @Column(nullable = false, unique = true)
    public int PIB;
    @Column(nullable = false, unique = true)
    public String swiftKod;
    @Column(nullable = false, unique = true)
    public String obracunskiRacun;
    @Column(nullable = false)
    @OneToOne
    public Mesto mesto;
	
    public Banka(){
    	
    }
    
    public Banka(double sifraBanke, String nazivBanke, String adresaBanke, String telefonBanke,
			int PIB, String swiftKod, String obracunskiRacun) {
		super();
		this.sifraBanke = sifraBanke;
		this.nazivBanke = nazivBanke;
		this.adresaBanke = adresaBanke;
		this.telefonBanke = telefonBanke;
		this.PIB = PIB;
		this.swiftKod = swiftKod;
		this.obracunskiRacun = obracunskiRacun;
	}

}