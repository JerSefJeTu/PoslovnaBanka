import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
/***********************************************************************
 * Module:  RACUN.java
 * Author:  Aleksa
 * Purpose: Defines the Class RACUN
 ***********************************************************************/
@Entity
public class RACUN {
   @Column(nullable = false, unique = true)
   public String BROJ_RACUNA;
   @Column(nullable = false, unique = true)
   public double ID_RACUNA;
   @Column(nullable = false)
   public GASENJE_RACUNA gASENJE_RACUNA;
   @OneToMany(mappedBy = "RACUN")
   public java.util.Collection<DNEVNO_STANJE_RACUNA> dNEVNO_STANJE_RACUNA;
   @ManyToOne
   public KLIJENT kLIJENT;
   @ManyToOne
   public BANKA bANKA;


   /** @pdGenerated default getter */
   public java.util.Collection<DNEVNO_STANJE_RACUNA> getDNEVNO_STANJE_RACUNA() {
      if (dNEVNO_STANJE_RACUNA == null)
         dNEVNO_STANJE_RACUNA = new java.util.HashSet<DNEVNO_STANJE_RACUNA>();
      return dNEVNO_STANJE_RACUNA;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDNEVNO_STANJE_RACUNA() {
      if (dNEVNO_STANJE_RACUNA == null)
         dNEVNO_STANJE_RACUNA = new java.util.HashSet<DNEVNO_STANJE_RACUNA>();
      return dNEVNO_STANJE_RACUNA.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDNEVNO_STANJE_RACUNA */
   public void setDNEVNO_STANJE_RACUNA(java.util.Collection<DNEVNO_STANJE_RACUNA> newDNEVNO_STANJE_RACUNA) {
      removeAllDNEVNO_STANJE_RACUNA();
      for (java.util.Iterator iter = newDNEVNO_STANJE_RACUNA.iterator(); iter.hasNext();)
         addDNEVNO_STANJE_RACUNA((DNEVNO_STANJE_RACUNA)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDNEVNO_STANJE_RACUNA */
   public void addDNEVNO_STANJE_RACUNA(DNEVNO_STANJE_RACUNA newDNEVNO_STANJE_RACUNA) {
      if (newDNEVNO_STANJE_RACUNA == null)
         return;
      if (this.dNEVNO_STANJE_RACUNA == null)
         this.dNEVNO_STANJE_RACUNA = new java.util.HashSet<DNEVNO_STANJE_RACUNA>();
      if (!this.dNEVNO_STANJE_RACUNA.contains(newDNEVNO_STANJE_RACUNA))
      {
         this.dNEVNO_STANJE_RACUNA.add(newDNEVNO_STANJE_RACUNA);
         newDNEVNO_STANJE_RACUNA.setRACUN(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDNEVNO_STANJE_RACUNA */
   public void removeDNEVNO_STANJE_RACUNA(DNEVNO_STANJE_RACUNA oldDNEVNO_STANJE_RACUNA) {
      if (oldDNEVNO_STANJE_RACUNA == null)
         return;
      if (this.dNEVNO_STANJE_RACUNA != null)
         if (this.dNEVNO_STANJE_RACUNA.contains(oldDNEVNO_STANJE_RACUNA))
         {
            this.dNEVNO_STANJE_RACUNA.remove(oldDNEVNO_STANJE_RACUNA);
            oldDNEVNO_STANJE_RACUNA.setRACUN((RACUN)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDNEVNO_STANJE_RACUNA() {
      if (dNEVNO_STANJE_RACUNA != null)
      {
         DNEVNO_STANJE_RACUNA oldDNEVNO_STANJE_RACUNA;
         for (java.util.Iterator iter = getIteratorDNEVNO_STANJE_RACUNA(); iter.hasNext();)
         {
            oldDNEVNO_STANJE_RACUNA = (DNEVNO_STANJE_RACUNA)iter.next();
            iter.remove();
            oldDNEVNO_STANJE_RACUNA.setRACUN((RACUN)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public KLIJENT getKLIJENT() {
      return kLIJENT;
   }
   
   /** @pdGenerated default parent setter
     * @param newKLIJENT */
   public void setKLIJENT(KLIJENT newKLIJENT) {
      if (this.kLIJENT == null || !this.kLIJENT.equals(newKLIJENT))
      {
         if (this.kLIJENT != null)
         {
            KLIJENT oldKLIJENT = this.kLIJENT;
            this.kLIJENT = null;
            oldKLIJENT.removeRACUN(this);
         }
         if (newKLIJENT != null)
         {
            this.kLIJENT = newKLIJENT;
            this.kLIJENT.addRACUN(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public BANKA getBANKA() {
      return bANKA;
   }
   
   /** @pdGenerated default parent setter
     * @param newBANKA */
   public void setBANKA(BANKA newBANKA) {
      if (this.bANKA == null || !this.bANKA.equals(newBANKA))
      {
         if (this.bANKA != null)
         {
            BANKA oldBANKA = this.bANKA;
            this.bANKA = null;
            oldBANKA.removeRACUN(this);
         }
         if (newBANKA != null)
         {
            this.bANKA = newBANKA;
            this.bANKA.addRACUN(this);
         }
      }
   }

   public RACUN() {
   }

   public RACUN(String BROJ_RACUNA, double ID_RACUNA, GASENJE_RACUNA gASENJE_RACUNA, Collection<DNEVNO_STANJE_RACUNA> dNEVNO_STANJE_RACUNA, KLIJENT kLIJENT, BANKA bANKA) {
      this.BROJ_RACUNA = BROJ_RACUNA;
      this.ID_RACUNA = ID_RACUNA;
      this.gASENJE_RACUNA = gASENJE_RACUNA;
      this.dNEVNO_STANJE_RACUNA = dNEVNO_STANJE_RACUNA;
      this.kLIJENT = kLIJENT;
      this.bANKA = bANKA;
   }
}