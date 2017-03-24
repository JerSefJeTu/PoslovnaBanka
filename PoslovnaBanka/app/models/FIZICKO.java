/***********************************************************************
 * Module:  FIZICKO.java
 * Author:  Aleksa
 * Purpose: Defines the Class FIZICKO
 ***********************************************************************/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;
@Entity
public class FIZICKO {
    @Column(nullable = false)
    public double ID_MESTA;
    @Column(nullable = false)
    public String ADRESA;
    @Column(nullable = false, unique = true)
    public String TELEFON;
    @Column(nullable = false, unique = true)
    public String FAX;
    @Column(nullable = false, unique = true)
    public String E_MAIL;
    @Column(nullable = false)
    public String IME;
    @Column(nullable = false)
    public String PREZIME;
    @Column(nullable = false, unique = true)
    public double JMBG;
    @ManyToOne
    public KLIJENT kLIJENT;

    public FIZICKO() {
    }

   public FIZICKO(double ID_MESTA, String ADRESA, String TELEFON, String FAX, String e_MAIL, String IME, String PREZIME, double JMBG, KLIJENT kLIJENT) {
      this.ID_MESTA = ID_MESTA;
      this.ADRESA = ADRESA;
      this.TELEFON = TELEFON;
      this.FAX = FAX;
      E_MAIL = e_MAIL;
      this.IME = IME;
      this.PREZIME = PREZIME;
      this.JMBG = JMBG;
      this.kLIJENT = kLIJENT;
   }
}