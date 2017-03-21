/***********************************************************************
 * Module:  NALOG.java
 * Author:  Aleksa
 * Purpose: Defines the Class NALOG
 ***********************************************************************/

import java.util.*;

/** @pdOid 3b7afb0b-3405-4ff4-89fe-513117ae8438 */
public class NALOG {
   /** @pdOid b9d28297-a0a5-4994-8010-e8a9cf7312f8 */
   public int ID_NALOGA;
   /** @pdOid 2c1045ab-6907-481d-a3d1-383eb3eb87f5 */
   public java.lang.String RACUN_DUZNIKA;
   /** @pdOid dfb23c7b-f4cc-4a6a-9a39-b9695f6419d0 */
   public java.lang.String RACUN_POVERIOCA;
   /** @pdOid 65a306f7-d8c6-4047-b6ed-439632fe66fa */
   public java.lang.String POZIV_NA_BROJ_ZADUZENJA;
   /** @pdOid a73732f7-ef14-431e-b38f-ab9fb0bed138 */
   public java.lang.String POZIV_NA_BROJ_ODOBRENJA;
   /** @pdOid eb785c62-eb3d-41f2-95da-d6d1ef4d9f79 */
   public double MODEL_ZADUZENJA;
   /** @pdOid a1fa4014-ac14-4c2d-8ffc-fbff9718b264 */
   public double MODEL_ODOBRENJA;
   /** @pdOid 8ce2b8c6-822e-46ad-9cef-fd79689f0fff */
   public double IZNOS;
   /** @pdOid eb89887a-9305-462a-8cf6-fe5789742b65 */
   public java.lang.String DUZNIK;
   /** @pdOid bf10167e-e9aa-468c-8072-8ca8b04ca7f2 */
   public java.lang.String PRIMALAC;
   /** @pdOid 05fbdd15-bf8c-4a15-baee-21f8300b58af */
   public java.lang.String SVRHA_PLACANJA;
   /** @pdOid e5947bf7-e982-42a6-a87b-5d1d03b02c66 */
   public java.util.Date DATUM_NALOGA;
   
   /** @pdRoleInfo migr=no name=DNEVNO_STANJE_RACUNA assc=RELATIONSHIP_13 mult=0..1 side=A */
   public DNEVNO_STANJE_RACUNA dNEVNO_STANJE_RACUNA;
   /** @pdRoleInfo migr=no name=MT10X assc=RELATIONSHIP_14 mult=0..1 side=A */
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

}