import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

/***********************************************************************
 * Module:  MT10X.java
 * Author:  Aleksa
 * Purpose: Defines the Class MT10X
 ***********************************************************************/
@Entity
public class MT10X {
   @Column(nullable = false, unique = true)
   public int ID_PORUKE;
   @Column(nullable = false)
   public Date DATUM_;
   @Column(nullable = false)
   public double UKUPAN_IZNOS;
   @Column(nullable = false)
   public String VRSTA_PORUKE;
   @Column(nullable = false)
   public String SWIFT_KOD1;
   @Column(nullable = false)
   public String SWIFT_KOD2;
   @Column(nullable = false)
   public String OBRACUNSKI_RACUN1;
   @Column(nullable = false)
   public String OBRACUNSKI_RACUN2;
   @Column(nullable = false)
   public boolean OBRADJENO;
   @OneToMany(mappedBy = "MT10X")
   public java.util.Collection<NALOG> nALOG;
   @ManyToOne
   public BANKA banka;
   @ManyToOne
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

   public MT10X() {
   }

   public MT10X(int ID_PORUKE, Date DATUM_, double UKUPAN_IZNOS, String VRSTA_PORUKE, String SWIFT_KOD1, String SWIFT_KOD2, String OBRACUNSKI_RACUN1, String OBRACUNSKI_RACUN2, boolean OBRADJENO, Collection<NALOG> nALOG, BANKA banka, BANKA banka2) {
      this.ID_PORUKE = ID_PORUKE;
      this.DATUM_ = DATUM_;
      this.UKUPAN_IZNOS = UKUPAN_IZNOS;
      this.VRSTA_PORUKE = VRSTA_PORUKE;
      this.SWIFT_KOD1 = SWIFT_KOD1;
      this.SWIFT_KOD2 = SWIFT_KOD2;
      this.OBRACUNSKI_RACUN1 = OBRACUNSKI_RACUN1;
      this.OBRACUNSKI_RACUN2 = OBRACUNSKI_RACUN2;
      this.OBRADJENO = OBRADJENO;
      this.nALOG = nALOG;
      this.banka = banka;
      this.banka2 = banka2;
   }
}