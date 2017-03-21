/***********************************************************************
 * Module:  DNEVNO_STANJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class DNEVNO_STANJE_RACUNA
 ***********************************************************************/

import java.util.*;

/** @pdOid 81df35e0-c1cd-4023-a711-bd6e353fd3a9 */
public class DNEVNO_STANJE_RACUNA {
   /** @pdOid 90c2749f-7f0f-4c8e-818f-c4937db62dbb */
   public int ID_DNEVNOG_STANJA;
   /** @pdOid e4fa0fe3-31ab-425c-a0b0-249552f02262 */
   public java.util.Date DATUM_;
   /** @pdOid 0e2bfc87-9af8-46a5-b6a4-8773b22ae475 */
   public double PRETHODNO_STANJE;
   /** @pdOid 2207750a-d374-4c28-9416-50f11bbfbc3a */
   public double PROMET_U_KORIST;
   /** @pdOid 84fafac5-1196-4618-9674-796ad1dc2b9b */
   public double STANJE_;
   /** @pdOid fc5fb878-85e6-4ad5-9f25-e99a996cd466 */
   public double NOVO_STANJE;
   
   /** @pdRoleInfo migr=no name=NALOG assc=RELATIONSHIP_13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<NALOG> nALOG;
   /** @pdRoleInfo migr=no name=RACUN assc=RELATIONSHIP_5 mult=1..1 side=A */
   public RACUN rACUN;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<NALOG> getNALOG() {
      if (nALOG == null)
         nALOG = new java.util.HashSet<NALOG>();
      return nALOG;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNALOG() {
      if (nALOG == null)
         nALOG = new java.util.HashSet<NALOG>();
      return nALOG.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNALOG */
   public void setNALOG(java.util.Collection<NALOG> newNALOG) {
      removeAllNALOG();
      for (java.util.Iterator iter = newNALOG.iterator(); iter.hasNext();)
         addNALOG((NALOG)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNALOG */
   public void addNALOG(NALOG newNALOG) {
      if (newNALOG == null)
         return;
      if (this.nALOG == null)
         this.nALOG = new java.util.HashSet<NALOG>();
      if (!this.nALOG.contains(newNALOG))
      {
         this.nALOG.add(newNALOG);
         newNALOG.setDNEVNO_STANJE_RACUNA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldNALOG */
   public void removeNALOG(NALOG oldNALOG) {
      if (oldNALOG == null)
         return;
      if (this.nALOG != null)
         if (this.nALOG.contains(oldNALOG))
         {
            this.nALOG.remove(oldNALOG);
            oldNALOG.setDNEVNO_STANJE_RACUNA((DNEVNO_STANJE_RACUNA)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNALOG() {
      if (nALOG != null)
      {
         NALOG oldNALOG;
         for (java.util.Iterator iter = getIteratorNALOG(); iter.hasNext();)
         {
            oldNALOG = (NALOG)iter.next();
            iter.remove();
            oldNALOG.setDNEVNO_STANJE_RACUNA((DNEVNO_STANJE_RACUNA)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public RACUN getRACUN() {
      return rACUN;
   }
   
   /** @pdGenerated default parent setter
     * @param newRACUN */
   public void setRACUN(RACUN newRACUN) {
      if (this.rACUN == null || !this.rACUN.equals(newRACUN))
      {
         if (this.rACUN != null)
         {
            RACUN oldRACUN = this.rACUN;
            this.rACUN = null;
            oldRACUN.removeDNEVNO_STANJE_RACUNA(this);
         }
         if (newRACUN != null)
         {
            this.rACUN = newRACUN;
            this.rACUN.addDNEVNO_STANJE_RACUNA(this);
         }
      }
   }

}