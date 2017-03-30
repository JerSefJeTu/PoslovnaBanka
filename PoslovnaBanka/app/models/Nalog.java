package models;

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
   @Column(nullable = false)
   public String racunduznika;
   @Column(nullable = false)
   public String racunPoverioca;
   @Column(nullable = true)
   public String pozivNaBrojZaduzenja;
   @Column(nullable = true)
   public String pozivNaBrojOdobrenja;
   @Column(nullable = true)
   public double modelZaduzenja;
   @Column(nullable = true)
   public double modelOdobrenja;
   @Column(nullable = false)
   public double iznos;
   @Column(nullable = true)
   public String duznik;
   @Column(nullable = true)
   public String primalac;
   @Column(nullable = true)
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

   public Nalog(String racunduznika, String racunPoverioca, String pozivNaBrojZaduzenja, String pozivNaBrojOdobrenja, double modelZaduzenja, double modelOdobrenja, double iznos, String duznik, String primalac, String svrhaPlacanja, Date datumNaloga,boolean sacuvan){ //,DnevnoStanjeRacuna dnevnoStanjeRacuna) {
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
}