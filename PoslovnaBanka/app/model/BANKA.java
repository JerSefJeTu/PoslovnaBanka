/***********************************************************************
 * Module:  BANKA.java
 * Author:  Aleksa
 * Purpose: Defines the Class BANKA
 ***********************************************************************/

import java.util.*;

/** @pdOid 68e4bfd6-7edd-461f-96ca-dd8fdec12316 */
public class BANKA {
   /** @pdOid 4401fdca-4e09-40d2-8d85-7ccd3c047fe0 */
   public int ID_BANKE;
   /** @pdOid 03f6140c-5f94-4e82-ae41-394bb63799d6 */
   public double SIFRA_BANKE;
   /** @pdOid e7364ab9-0edb-4116-9a75-d45ae4bf79f0 */
   public java.lang.String NAZIV_BANKE;
   /** @pdOid 86b603cf-5840-4aa8-ac07-98272a1a4489 */
   public java.lang.String ADRESA_BANKE;
   /** @pdOid 849ac2c4-acf6-4c53-8631-f4074ecf1a72 */
   public java.lang.String TELEFON_BANKE;
   /** @pdOid e1dcecb8-6fec-48f2-a323-11f93895efb1 */
   public double PIB;
   /** @pdOid f3e70cb3-1f61-400f-b007-fb5c8685384b */
   public java.lang.String SWIFT_KOD;
   /** @pdOid 0e667e45-c52b-4135-98d9-5921576df071 */
   public java.lang.String OBRACUNSKI_RACUN;
   
   /** @pdRoleInfo migr=no name=RACUN assc=RELATIONSHIP_2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<RACUN> rACUN;
   /** @pdRoleInfo migr=no name=MT10X assc=DUZNIK coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<MT10X> mt10x;
   /** @pdRoleInfo migr=no name=MT10X assc=POVERILAC coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<MT10X> mt10x2;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<RACUN> getRACUN() {
      if (rACUN == null)
         rACUN = new java.util.HashSet<RACUN>();
      return rACUN;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRACUN() {
      if (rACUN == null)
         rACUN = new java.util.HashSet<RACUN>();
      return rACUN.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRACUN */
   public void setRACUN(java.util.Collection<RACUN> newRACUN) {
      removeAllRACUN();
      for (java.util.Iterator iter = newRACUN.iterator(); iter.hasNext();)
         addRACUN((RACUN)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRACUN */
   public void addRACUN(RACUN newRACUN) {
      if (newRACUN == null)
         return;
      if (this.rACUN == null)
         this.rACUN = new java.util.HashSet<RACUN>();
      if (!this.rACUN.contains(newRACUN))
      {
         this.rACUN.add(newRACUN);
         newRACUN.setBANKA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRACUN */
   public void removeRACUN(RACUN oldRACUN) {
      if (oldRACUN == null)
         return;
      if (this.rACUN != null)
         if (this.rACUN.contains(oldRACUN))
         {
            this.rACUN.remove(oldRACUN);
            oldRACUN.setBANKA((BANKA)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRACUN() {
      if (rACUN != null)
      {
         RACUN oldRACUN;
         for (java.util.Iterator iter = getIteratorRACUN(); iter.hasNext();)
         {
            oldRACUN = (RACUN)iter.next();
            iter.remove();
            oldRACUN.setBANKA((BANKA)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<MT10X> getMt10x() {
      if (mt10x == null)
         mt10x = new java.util.HashSet<MT10X>();
      return mt10x;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMt10x() {
      if (mt10x == null)
         mt10x = new java.util.HashSet<MT10X>();
      return mt10x.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMt10x */
   public void setMt10x(java.util.Collection<MT10X> newMt10x) {
      removeAllMt10x();
      for (java.util.Iterator iter = newMt10x.iterator(); iter.hasNext();)
         addMt10x((MT10X)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMT10X */
   public void addMt10x(MT10X newMT10X) {
      if (newMT10X == null)
         return;
      if (this.mt10x == null)
         this.mt10x = new java.util.HashSet<MT10X>();
      if (!this.mt10x.contains(newMT10X))
      {
         this.mt10x.add(newMT10X);
         newMT10X.setBanka(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMT10X */
   public void removeMt10x(MT10X oldMT10X) {
      if (oldMT10X == null)
         return;
      if (this.mt10x != null)
         if (this.mt10x.contains(oldMT10X))
         {
            this.mt10x.remove(oldMT10X);
            oldMT10X.setBanka((BANKA)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMt10x() {
      if (mt10x != null)
      {
         MT10X oldMT10X;
         for (java.util.Iterator iter = getIteratorMt10x(); iter.hasNext();)
         {
            oldMT10X = (MT10X)iter.next();
            iter.remove();
            oldMT10X.setBanka((BANKA)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<MT10X> getMt10x2() {
      if (mt10x2 == null)
         mt10x2 = new java.util.HashSet<MT10X>();
      return mt10x2;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMt10x2() {
      if (mt10x2 == null)
         mt10x2 = new java.util.HashSet<MT10X>();
      return mt10x2.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMt10x2 */
   public void setMt10x2(java.util.Collection<MT10X> newMt10x2) {
      removeAllMt10x2();
      for (java.util.Iterator iter = newMt10x2.iterator(); iter.hasNext();)
         addMt10x2((MT10X)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMT10X */
   public void addMt10x2(MT10X newMT10X) {
      if (newMT10X == null)
         return;
      if (this.mt10x2 == null)
         this.mt10x2 = new java.util.HashSet<MT10X>();
      if (!this.mt10x2.contains(newMT10X))
      {
         this.mt10x2.add(newMT10X);
         newMT10X.setBanka2(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMT10X */
   public void removeMt10x2(MT10X oldMT10X) {
      if (oldMT10X == null)
         return;
      if (this.mt10x2 != null)
         if (this.mt10x2.contains(oldMT10X))
         {
            this.mt10x2.remove(oldMT10X);
            oldMT10X.setBanka2((BANKA)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMt10x2() {
      if (mt10x2 != null)
      {
         MT10X oldMT10X;
         for (java.util.Iterator iter = getIteratorMt10x2(); iter.hasNext();)
         {
            oldMT10X = (MT10X)iter.next();
            iter.remove();
            oldMT10X.setBanka2((BANKA)null);
         }
      }
   }

}