/***********************************************************************
 * Module:  DELATNOST.java
 * Author:  Aleksa
 * Purpose: Defines the Class DELATNOST
 ***********************************************************************/

import java.util.*;

/** @pdOid 82ada0c4-cdbc-48c2-bb70-9eb39060c251 */
public class DELATNOST {
   /** @pdOid 72158d8e-c6d6-4845-8819-4846c21f364e */
   public double ID_DELATNOSTI;
   /** @pdOid c0398f52-ab0a-4503-994a-abc66e606e8b */
   public double SIFRA_DELATNOSTI;
   /** @pdOid 8f854497-afa7-4058-bdf1-abb3d292e72c */
   public java.lang.String NAZIV_DELATNOSTI;
   
   /** @pdRoleInfo migr=no name=PRAVNO assc=RELATIONSHIP_10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<PRAVNO> pRAVNO;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<PRAVNO> getPRAVNO() {
      if (pRAVNO == null)
         pRAVNO = new java.util.HashSet<PRAVNO>();
      return pRAVNO;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPRAVNO() {
      if (pRAVNO == null)
         pRAVNO = new java.util.HashSet<PRAVNO>();
      return pRAVNO.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPRAVNO */
   public void setPRAVNO(java.util.Collection<PRAVNO> newPRAVNO) {
      removeAllPRAVNO();
      for (java.util.Iterator iter = newPRAVNO.iterator(); iter.hasNext();)
         addPRAVNO((PRAVNO)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPRAVNO */
   public void addPRAVNO(PRAVNO newPRAVNO) {
      if (newPRAVNO == null)
         return;
      if (this.pRAVNO == null)
         this.pRAVNO = new java.util.HashSet<PRAVNO>();
      if (!this.pRAVNO.contains(newPRAVNO))
      {
         this.pRAVNO.add(newPRAVNO);
         newPRAVNO.setDELATNOST(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPRAVNO */
   public void removePRAVNO(PRAVNO oldPRAVNO) {
      if (oldPRAVNO == null)
         return;
      if (this.pRAVNO != null)
         if (this.pRAVNO.contains(oldPRAVNO))
         {
            this.pRAVNO.remove(oldPRAVNO);
            oldPRAVNO.setDELATNOST((DELATNOST)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPRAVNO() {
      if (pRAVNO != null)
      {
         PRAVNO oldPRAVNO;
         for (java.util.Iterator iter = getIteratorPRAVNO(); iter.hasNext();)
         {
            oldPRAVNO = (PRAVNO)iter.next();
            iter.remove();
            oldPRAVNO.setDELATNOST((DELATNOST)null);
         }
      }
   }

}