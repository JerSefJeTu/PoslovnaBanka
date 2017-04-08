package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
/***********************************************************************
 * Module:  Nalog.java
 * Author:  Aleksa
 * Purpose: Defines the Class Nalog
 ***********************************************************************/
@Entity
public class Nalog extends Model {
   @Required
   @Column(nullable = false)
   public String racunduznika;
   
	@Required
   @Column(nullable = false)
   public String sifraPlacanja;
	
	@Required
	@Column(nullable = false)
	public String racunPoverioca;
	
	@Required
   @Column(nullable = true)
   public String pozivNaBrojZaduzenja;
	
	@Required
   @Column(nullable = true)
   public String pozivNaBrojOdobrenja;
	
   @Column(nullable = true)
   @Required
   public String modelZaduzenja;
   
   @Column(nullable = true)
   @Required
   public String modelOdobrenja;
   
   @Column(nullable = false)
   @Required
   public double iznos;
   
   @Column(nullable = true)
   @Required
   public String duznik;
   
   @Column(nullable = true)
   @Required
   public String primalac;
   
   @Column(nullable = true)
   @Required
   public String svrhaPlacanja;
   
   @Column(nullable = false)
   public Date datumNaloga;
   
   @Column(nullable = false)
   public boolean sacuvan;

   @ManyToOne
   public DnevnoStanjeRacuna dnevnoStanjeRacuna;

   @ManyToOne
   public MT10X mt10x;

   public Nalog() {
   }

   public Nalog(String racunduznika, String racunPoverioca, String pozivNaBrojZaduzenja, String pozivNaBrojOdobrenja, String modelZaduzenja, String modelOdobrenja, double iznos, String duznik, String primalac, String svrhaPlacanja, Date datumNaloga,boolean sacuvan){ //,DnevnoStanjeRacuna dnevnoStanjeRacuna) {
      super();
	   this.racunduznika = racunduznika;
      this.racunPoverioca = racunPoverioca;
      this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
      this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
      this.modelZaduzenja = modelZaduzenja;
      this.modelOdobrenja = modelOdobrenja;
      this.iznos = iznos;
      this.duznik = duznik;
      this.primalac = primalac;
      this.svrhaPlacanja = svrhaPlacanja;
      this.datumNaloga = datumNaloga;
      this.sacuvan=sacuvan;
//      this.dNEVNO_STANJE_RACUNA = dnevnoStanjeRacuna;
   }

@Override
public String toString() {
	return "Nalog [racunduznika=" + racunduznika + ", sifraPlacanja=" + sifraPlacanja + ", racunPoverioca="
			+ racunPoverioca + ", pozivNaBrojZaduzenja=" + pozivNaBrojZaduzenja + ", pozivNaBrojOdobrenja="
			+ pozivNaBrojOdobrenja + ", modelZaduzenja=" + modelZaduzenja + ", modelOdobrenja=" + modelOdobrenja
			+ ", iznos=" + iznos + ", duznik=" + duznik + ", primalac=" + primalac + ", svrhaPlacanja=" + svrhaPlacanja
			+ ", datumNaloga=" + datumNaloga + ", sacuvan=" + sacuvan + ", dnevnoStanjeRacuna=" + dnevnoStanjeRacuna
			+ ", mt10x=" + mt10x + "]";
}
   
}