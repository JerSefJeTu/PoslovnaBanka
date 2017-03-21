/***********************************************************************
 * Module:  KLIJENT.java
 * Author:  Aleksa
 * Purpose: Defines the Class KLIJENT
 ***********************************************************************/

import java.util.*;

/** @pdOid 5b91287a-92c7-4e5a-8f39-c75e38cc98e5 */
public class KLIJENT {
   /** @pdOid ee4e975d-809d-4866-b67f-03418794b81b */
   public int ID_KLIJENTA;
   /** @pdOid 06cab7e3-c0d4-4806-a927-f817a44653ed */
   public java.lang.String ADRESA;
   /** @pdOid 9d8df846-275a-426a-afeb-df77662b7001 */
   public java.lang.String TELEFON;
   /** @pdOid bcf32216-4396-47a5-a644-4ac92bf60990 */
   public java.lang.String FAX;
   /** @pdOid 958392a6-3d2f-4a16-8321-79d2e47a12aa */
   public java.lang.String E_MAIL;
   
   /** @pdRoleInfo migr=no name=RACUN assc=RELATIONSHIP_1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<RACUN> rACUN;
   /** @pdRoleInfo migr=no name=PRAVNO assc=INHERITANCE_1 mult=0..1 type=Composition */
   public PRAVNO pRAVNO;
   /** @pdRoleInfo migr=no name=FIZICKO assc=INHERITANCE_2 mult=0..1 type=Composition */
   public FIZICKO fIZICKO;
   /** @pdRoleInfo migr=no name=MESTO assc=RELATIONSHIP_11 mult=0..1 side=A */
   public MESTO mESTO;
   
   
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
         newRACUN.setKLIJENT(this);      
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
            oldRACUN.setKLIJENT((KLIJENT)null);
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
            oldRACUN.setKLIJENT((KLIJENT)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public MESTO getMESTO() {
      return mESTO;
   }
   
   /** @pdGenerated default parent setter
     * @param newMESTO */
   public void setMESTO(MESTO newMESTO) {
      if (this.mESTO == null || !this.mESTO.equals(newMESTO))
      {
         if (this.mESTO != null)
         {
            MESTO oldMESTO = this.mESTO;
            this.mESTO = null;
            oldMESTO.removeKLIJENT(this);
         }
         if (newMESTO != null)
         {
            this.mESTO = newMESTO;
            this.mESTO.addKLIJENT(this);
         }
      }
   }

}