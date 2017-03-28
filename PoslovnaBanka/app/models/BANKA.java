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
 * Module:  BANKA.java
 * Author:  Aleksa
 * Purpose: Defines the Class BANKA
 ***********************************************************************/
@Entity
public class BANKA extends Model {

    @Column(nullable = false, unique = true)
    public double SIFRA_BANKE;
    @Column(nullable = false, unique = true)
    public String NAZIV_BANKE;
    @Column(nullable = false, unique = true)
    public String ADRESA_BANKE;
    @Column(nullable = false, unique = true)
    public String TELEFON_BANKE;
    @Column(nullable = false, unique = true)
    public double PIB;
    @Column(nullable = false, unique = true)
    public String SWIFT_KOD;
    @Column(nullable = false, unique = true)
    public String OBRACUNSKI_RACUN;
    @Column(nullable = false)
    @OneToOne //dovrsi vezu
    public MESTO mesto;
	
    public BANKA(){
    	
    }
    
    public BANKA(int iD_BANKE, double sIFRA_BANKE, String nAZIV_BANKE, String aDRESA_BANKE, String tELEFON_BANKE,
			double pIB, String sWIFT_KOD, String oBRACUNSKI_RACUN) {
		super();
		SIFRA_BANKE = sIFRA_BANKE;
		NAZIV_BANKE = nAZIV_BANKE;
		ADRESA_BANKE = aDRESA_BANKE;
		TELEFON_BANKE = tELEFON_BANKE;
		PIB = pIB;
		SWIFT_KOD = sWIFT_KOD;
		OBRACUNSKI_RACUN = oBRACUNSKI_RACUN;
	}

}