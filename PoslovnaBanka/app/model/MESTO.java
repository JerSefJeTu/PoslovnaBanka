/***********************************************************************
 * Module:  MESTO.java
 * Author:  Aleksa
 * Purpose: Defines the Class MESTO
 ***********************************************************************/

import java.util.*;

/** @pdOid 0a901c6a-b473-4b79-9bed-69abf018045a */
public class MESTO {
   /** @pdOid 5bbb5946-9e1a-45df-a363-fd86134833de */
   public double ID_MESTA;
   /** @pdOid 2257747f-ce3d-46a4-8d9c-f06df1c2bc33 */
   public double POSTANSKI_BROJ;
   /** @pdOid 771510e7-048c-46d5-bf82-feca2c838ee7 */
   public java.lang.String NAZIV;
   
   /** @pdRoleInfo migr=no name=KLIJENT assc=RELATIONSHIP_11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<KLIJENT> kLIJENT;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<KLIJENT> getKLIJENT() {
      if (kLIJENT == null)
         kLIJENT = new java.util.HashSet<KLIJENT>();
      return kLIJENT;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKLIJENT() {
      if (kLIJENT == null)
         kLIJENT = new java.util.HashSet<KLIJENT>();
      return kLIJENT.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKLIJENT */
   public void setKLIJENT(java.util.Collection<KLIJENT> newKLIJENT) {
      removeAllKLIJENT();
      for (java.util.Iterator iter = newKLIJENT.iterator(); iter.hasNext();)
         addKLIJENT((KLIJENT)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKLIJENT */
   public void addKLIJENT(KLIJENT newKLIJENT) {
      if (newKLIJENT == null)
         return;
      if (this.kLIJENT == null)
         this.kLIJENT = new java.util.HashSet<KLIJENT>();
      if (!this.kLIJENT.contains(newKLIJENT))
      {
         this.kLIJENT.add(newKLIJENT);
         newKLIJENT.setMESTO(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldKLIJENT */
   public void removeKLIJENT(KLIJENT oldKLIJENT) {
      if (oldKLIJENT == null)
         return;
      if (this.kLIJENT != null)
         if (this.kLIJENT.contains(oldKLIJENT))
         {
            this.kLIJENT.remove(oldKLIJENT);
            oldKLIJENT.setMESTO((MESTO)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKLIJENT() {
      if (kLIJENT != null)
      {
         KLIJENT oldKLIJENT;
         for (java.util.Iterator iter = getIteratorKLIJENT(); iter.hasNext();)
         {
            oldKLIJENT = (KLIJENT)iter.next();
            iter.remove();
            oldKLIJENT.setMESTO((MESTO)null);
         }
      }
   }

}