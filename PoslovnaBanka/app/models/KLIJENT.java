package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  KLIJENT.java
 * Author:  Aleksa
 * Purpose: Defines the Class KLIJENT
 ***********************************************************************/
@Entity
public class KLIJENT extends Model {
    @Column(nullable = false, unique = true)
    public int ID_KLIJENTA;
    @Column(nullable = false, unique = true)
    public String ADRESA;
    @Column(nullable = false, unique = true)
    public String TELEFON;
    @Column(nullable = false, unique = true)
    public String FAX;
    @Column(nullable = false, unique = true)
    public String E_MAIL;

    @OneToMany(mappedBy = "kLIJENT")
    public java.util.Collection<RACUN> rACUN;
    @ManyToOne
    public PRAVNO pRAVNO;
    @ManyToOne
    public FIZICKO fIZICKO;
    @ManyToOne
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

   public KLIJENT() {
   }

   public KLIJENT(int ID_KLIJENTA, String ADRESA, String TELEFON, String FAX, String e_MAIL, Collection<RACUN> rACUN, PRAVNO pRAVNO, FIZICKO fIZICKO, MESTO mESTO) {
      this.ID_KLIJENTA = ID_KLIJENTA;
      this.ADRESA = ADRESA;
      this.TELEFON = TELEFON;
      this.FAX = FAX;
      E_MAIL = e_MAIL;
      this.rACUN = rACUN;
      this.pRAVNO = pRAVNO;
      this.fIZICKO = fIZICKO;
      this.mESTO = mESTO;
   }
}