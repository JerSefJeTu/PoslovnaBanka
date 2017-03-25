package models;

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
public class NALOG {
   @Column(nullable = false, unique = true)
   public int ID_NALOGA;
   @Column(nullable = false, unique = true)
   public String RACUN_DUZNIKA;
   @Column(nullable = false, unique = true)
   public String RACUN_POVERIOCA;
   @Column(nullable = false, unique = true)
   public String POZIV_NA_BROJ_ZADUZENJA;
   @Column(nullable = false, unique = true)
   public String POZIV_NA_BROJ_ODOBRENJA;
   @Column(nullable = false, unique = true)
   public double MODEL_ZADUZENJA;
   @Column(nullable = false, unique = true)
   public double MODEL_ODOBRENJA;
   @Column(nullable = false, unique = true)
   public double IZNOS;
   @Column(nullable = false, unique = true)
   public String DUZNIK;
   @Column(nullable = false, unique = true)
   public String PRIMALAC;
   @Column(nullable = false, unique = true)
   public String SVRHA_PLACANJA;
   @Column(nullable = false, unique = true)
   public Date DATUM_NALOGA;
   @ManyToOne
   public DNEVNO_STANJE_RACUNA dNEVNO_STANJE_RACUNA;
   @ManyToOne
   public MT10X mT10X;


   /** @pdGenerated default parent getter */
   public DNEVNO_STANJE_RACUNA getDNEVNO_STANJE_RACUNA() {
      return dNEVNO_STANJE_RACUNA;
   }
   
   /** @pdGenerated default parent setter
     * @param newDNEVNO_STANJE_RACUNA */
   public void setDNEVNO_STANJE_RACUNA(DNEVNO_STANJE_RACUNA newDNEVNO_STANJE_RACUNA) {
      if (this.dNEVNO_STANJE_RACUNA == null || !this.dNEVNO_STANJE_RACUNA.equals(newDNEVNO_STANJE_RACUNA))
      {
         if (this.dNEVNO_STANJE_RACUNA != null)
         {
            DNEVNO_STANJE_RACUNA oldDNEVNO_STANJE_RACUNA = this.dNEVNO_STANJE_RACUNA;
            this.dNEVNO_STANJE_RACUNA = null;
            oldDNEVNO_STANJE_RACUNA.removeNALOG(this);
         }
         if (newDNEVNO_STANJE_RACUNA != null)
         {
            this.dNEVNO_STANJE_RACUNA = newDNEVNO_STANJE_RACUNA;
            this.dNEVNO_STANJE_RACUNA.addNALOG(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public MT10X getMT10X() {
      return mT10X;
   }
   
   /** @pdGenerated default parent setter
     * @param newMT10X */
   public void setMT10X(MT10X newMT10X) {
      if (this.mT10X == null || !this.mT10X.equals(newMT10X))
      {
         if (this.mT10X != null)
         {
            MT10X oldMT10X = this.mT10X;
            this.mT10X = null;
            oldMT10X.removeNALOG(this);
         }
         if (newMT10X != null)
         {
            this.mT10X = newMT10X;
            this.mT10X.addNALOG(this);
         }
      }
   }

   public NALOG() {
   }

   public NALOG(int ID_NALOGA, String RACUN_DUZNIKA, String RACUN_POVERIOCA, String POZIV_NA_BROJ_ZADUZENJA, String POZIV_NA_BROJ_ODOBRENJA, double MODEL_ZADUZENJA, double MODEL_ODOBRENJA, double IZNOS, String DUZNIK, String PRIMALAC, String SVRHA_PLACANJA, Date DATUM_NALOGA, DNEVNO_STANJE_RACUNA dNEVNO_STANJE_RACUNA, MT10X mT10X) {
      this.ID_NALOGA = ID_NALOGA;
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
      this.dNEVNO_STANJE_RACUNA = dNEVNO_STANJE_RACUNA;
      this.mT10X = mT10X;
   }
}