/***********************************************************************
 * Module:  MT10X.java
 * Author:  Aleksa
 * Purpose: Defines the Class MT10X
 ***********************************************************************/

import java.util.*;

/** @pdOid 283fe056-547e-47b9-a597-a4f81dc665da */
public class MT10X {
   /** @pdOid d0979773-bd22-4911-9feb-67dc3883fdb6 */
   public int ID_PORUKE;
   /** @pdOid 16059dba-f351-423f-ad11-1911d72b0281 */
   public java.util.Date DATUM_;
   /** @pdOid 0c4ae0b9-2b3a-41b0-9d79-49ebdd3d9a7f */
   public double UKUPAN_IZNOS;
   /** @pdOid a05e5a9e-0cfe-4eb5-a767-74216f87c8ca */
   public java.lang.String VRSTA_PORUKE;
   /** @pdOid 412a5523-8899-488c-9bbd-4d21c53b5bae */
   public java.lang.String SWIFT_KOD1;
   /** @pdOid fe3e17a3-6351-4507-adc4-2e3cb02d364b */
   public java.lang.String SWIFT_KOD2;
   /** @pdOid 3fbd9e85-209c-4b8a-a349-a559dd24114b */
   public java.lang.String OBRACUNSKI_RACUN1;
   /** @pdOid 216f9125-8dc4-4777-8b9b-4c64f746637a */
   public java.lang.String OBRACUNSKI_RACUN2;
   /** @pdOid 328495c7-3cc9-4322-89ef-e40ceeba3892 */
   public boolean OBRADJENO;
   
   /** @pdRoleInfo migr=no name=NALOG assc=RELATIONSHIP_14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<NALOG> nALOG;
   /** @pdRoleInfo migr=no name=BANKA assc=DUZNIK mult=1..1 side=A */
   public BANKA banka;
   /** @pdRoleInfo migr=no name=BANKA assc=POVERILAC mult=1..1 side=A */
   public BANKA banka2;
   
   
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
         newNALOG.setMT10X(this);      
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
            oldNALOG.setMT10X((MT10X)null);
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
            oldNALOG.setMT10X((MT10X)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public BANKA getBanka() {
      return banka;
   }
   
   /** @pdGenerated default parent setter
     * @param newBANKA */
   public void setBanka(BANKA newBANKA) {
      if (this.banka == null || !this.banka.equals(newBANKA))
      {
         if (this.banka != null)
         {
            BANKA oldBANKA = this.banka;
            this.banka = null;
            oldBANKA.removeMt10x(this);
         }
         if (newBANKA != null)
         {
            this.banka = newBANKA;
            this.banka.addMt10x(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public BANKA getBanka2() {
      return banka2;
   }
   
   /** @pdGenerated default parent setter
     * @param newBANKA */
   public void setBanka2(BANKA newBANKA) {
      if (this.banka2 == null || !this.banka2.equals(newBANKA))
      {
         if (this.banka2 != null)
         {
            BANKA oldBANKA = this.banka2;
            this.banka2 = null;
            oldBANKA.removeMt10x2(this);
         }
         if (newBANKA != null)
         {
            this.banka2 = newBANKA;
            this.banka2.addMt10x2(this);
         }
      }
   }

}