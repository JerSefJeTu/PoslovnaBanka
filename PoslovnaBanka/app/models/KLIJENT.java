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