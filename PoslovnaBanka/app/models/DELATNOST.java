import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
/***********************************************************************
 * Module:  DELATNOST.java
 * Author:  Aleksa
 * Purpose: Defines the Class DELATNOST
 ***********************************************************************/
@Entity
public class DELATNOST {
   @Column(nullable = false, unique = true)
   public double ID_DELATNOSTI;
   @Column(nullable = false, unique = true)
   public double SIFRA_DELATNOSTI;
   @Column(nullable = false, unique = true)
   public String NAZIV_DELATNOSTI;
   @OneToMany(mappedBy = "DELATNOST")
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

   public DELATNOST() {
   }

   public DELATNOST(double ID_DELATNOSTI, double SIFRA_DELATNOSTI, String NAZIV_DELATNOSTI, Collection<PRAVNO> pRAVNO) {
      this.ID_DELATNOSTI = ID_DELATNOSTI;
      this.SIFRA_DELATNOSTI = SIFRA_DELATNOSTI;
      this.NAZIV_DELATNOSTI = NAZIV_DELATNOSTI;
      this.pRAVNO = pRAVNO;
   }
}