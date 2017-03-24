/***********************************************************************
 * Module:  DNEVNO_STANJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class DNEVNO_STANJE_RACUNA
 ***********************************************************************/
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
@Entity
public class DNEVNO_STANJE_RACUNA {
   @Column(nullable = false, unique = true)
   public int ID_DNEVNOG_STANJA;
   @Column(nullable = false)
   public Date DATUM_;
   @Column(nullable = false)
   public double PRETHODNO_STANJE;
   @Column(nullable = false)
   public double PROMET_U_KORIST;
   @Column(nullable = false)
   public double STANJE_;
   @Column(nullable = false)
   public double NOVO_STANJE;
   @OneToMany(mappedBy = "DNEVNO_STANJE_RACUNA")
   public java.util.Collection<NALOG> nALOG;
   @ManyToOne
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

   public DNEVNO_STANJE_RACUNA() {
   }

   public DNEVNO_STANJE_RACUNA(int ID_DNEVNOG_STANJA, Date DATUM_, double PRETHODNO_STANJE, double PROMET_U_KORIST, double STANJE_, double NOVO_STANJE, Collection<NALOG> nALOG, RACUN rACUN) {
      this.ID_DNEVNOG_STANJA = ID_DNEVNOG_STANJA;
      this.DATUM_ = DATUM_;
      this.PRETHODNO_STANJE = PRETHODNO_STANJE;
      this.PROMET_U_KORIST = PROMET_U_KORIST;
      this.STANJE_ = STANJE_;
      this.NOVO_STANJE = NOVO_STANJE;
      this.nALOG = nALOG;
      this.rACUN = rACUN;
   }
}