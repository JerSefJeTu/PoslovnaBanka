package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
/***********************************************************************
 * Module:  NALOG.java
 * Author:  Aleksa
 * Purpose: Defines the Class NALOG
 ***********************************************************************/
@Entity
public class NALOG extends Model {
   @Column(nullable = false)
   public String RACUN_DUZNIKA;
   @Column(nullable = false)
   public String RACUN_POVERIOCA;
   @Column(nullable = true)
   public String POZIV_NA_BROJ_ZADUZENJA;
   @Column(nullable = true)
   public String POZIV_NA_BROJ_ODOBRENJA;
   @Column(nullable = true)
   public double MODEL_ZADUZENJA;
   @Column(nullable = true)
   public double MODEL_ODOBRENJA;
   @Column(nullable = false)
   public double IZNOS;
   @Column(nullable = true)
   public String DUZNIK;
   @Column(nullable = true)
   public String PRIMALAC;
   @Column(nullable = true)
   public String SVRHA_PLACANJA;
   @Column(nullable = false)
   public Date DATUM_NALOGA;
//   @ManyToOne
//   public DNEVNO_STANJE_RACUNA dNEVNO_STANJE_RACUNA;

   public NALOG() {
   }

   public NALOG(String RACUN_DUZNIKA, String RACUN_POVERIOCA, String POZIV_NA_BROJ_ZADUZENJA, String POZIV_NA_BROJ_ODOBRENJA, double MODEL_ZADUZENJA, double MODEL_ODOBRENJA, double IZNOS, String DUZNIK, String PRIMALAC, String SVRHA_PLACANJA, Date DATUM_NALOGA){ //,DNEVNO_STANJE_RACUNA dNEVNO_STANJE_RACUNA) {
      this.RACUN_DUZNIKA = RACUN_DUZNIKA;
      this.RACUN_POVERIOCA = RACUN_POVERIOCA;
      this.POZIV_NA_BROJ_ZADUZENJA = POZIV_NA_BROJ_ZADUZENJA;
      this.POZIV_NA_BROJ_ODOBRENJA = POZIV_NA_BROJ_ODOBRENJA;
      this.MODEL_ZADUZENJA = MODEL_ZADUZENJA;
      this.MODEL_ODOBRENJA = MODEL_ODOBRENJA;
      this.IZNOS = IZNOS;
      this.DUZNIK = DUZNIK;
      this.PRIMALAC = PRIMALAC;
      this.SVRHA_PLACANJA = SVRHA_PLACANJA;
      this.DATUM_NALOGA = DATUM_NALOGA;
//      this.dNEVNO_STANJE_RACUNA = dNEVNO_STANJE_RACUNA;
   }
}