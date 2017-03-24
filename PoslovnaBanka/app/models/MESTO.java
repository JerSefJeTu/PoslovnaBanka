import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
/***********************************************************************
 * Module:  MESTO.java
 * Author:  Aleksa
 * Purpose: Defines the Class MESTO
 ***********************************************************************/
@Entity
public class MESTO {
    @Column(nullable = false, unique = true)
    public double ID_MESTA;
    @Column(nullable = false, unique = true)
    public double POSTANSKI_BROJ;
    @Column(nullable = false)
    public String NAZIV;
    @OneToMany(mappedBy = "MESTO")
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

    public MESTO() {
    }

    public MESTO(double ID_MESTA, double POSTANSKI_BROJ, String NAZIV, Collection<KLIJENT> kLIJENT) {
        this.ID_MESTA = ID_MESTA;
        this.POSTANSKI_BROJ = POSTANSKI_BROJ;
        this.NAZIV = NAZIV;
        this.kLIJENT = kLIJENT;
    }
}