/***********************************************************************
 * Module:  PRAVNO.java
 * Author:  Aleksa
 * Purpose: Defines the Class PRAVNO
 ***********************************************************************/
@Entity
public class PRAVNO {
   @Column(nullable = false, unique = true)
   public double ID_MESTA;
   @Column(nullable = false)
   public String ADRESA;
   @Column(nullable = false)
   public String TELEFON;
   @Column(nullable = false, unique = true)
   public String FAX;
   @Column(nullable = false, unique = true)
   public String E_MAIL;
   @Column(nullable = false, unique = true)
   public String NAZIV;
   @Column(nullable = false, unique = true)
   public double PIB;
   @Column(nullable = false, unique = true)
   public double MATICNI_BROJ;
   @ManyToOne
   public DELATNOST dELATNOST;
   @ManyToOne
   public KLIJENT kLIJENT;


   /** @pdGenerated default parent getter */
   public DELATNOST getDELATNOST() {
      return dELATNOST;
   }
   
   /** @pdGenerated default parent setter
     * @param newDELATNOST */
   public void setDELATNOST(DELATNOST newDELATNOST) {
      if (this.dELATNOST == null || !this.dELATNOST.equals(newDELATNOST))
      {
         if (this.dELATNOST != null)
         {
            DELATNOST oldDELATNOST = this.dELATNOST;
            this.dELATNOST = null;
            oldDELATNOST.removePRAVNO(this);
         }
         if (newDELATNOST != null)
         {
            this.dELATNOST = newDELATNOST;
            this.dELATNOST.addPRAVNO(this);
         }
      }
   }

   public PRAVNO() {
   }

   public PRAVNO(double ID_MESTA, String ADRESA, String TELEFON, String FAX, String e_MAIL, String NAZIV, double PIB, double MATICNI_BROJ, DELATNOST dELATNOST, KLIJENT kLIJENT) {
      this.ID_MESTA = ID_MESTA;
      this.ADRESA = ADRESA;
      this.TELEFON = TELEFON;
      this.FAX = FAX;
      E_MAIL = e_MAIL;
      this.NAZIV = NAZIV;
      this.PIB = PIB;
      this.MATICNI_BROJ = MATICNI_BROJ;
      this.dELATNOST = dELATNOST;
      this.kLIJENT = kLIJENT;
   }
}