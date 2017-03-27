package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  DELATNOST.java
 * Author:  Aleksa
 * Purpose: Defines the Class DELATNOST
 ***********************************************************************/
@Entity
public class DELATNOST extends Model {

   @Column(nullable = false, unique = true)
   public int SIFRA_DELATNOSTI;
   @Column(nullable = false, unique = true)
   public String NAZIV_DELATNOSTI;
   @OneToMany(mappedBy = "dELATNOST")
   public java.util.Collection<PRAVNO> pRAVNO;


   public DELATNOST() {
   }

   public DELATNOST(int SIFRA_DELATNOSTI, String NAZIV_DELATNOSTI, Collection<PRAVNO> pRAVNO) {
      this.SIFRA_DELATNOSTI = SIFRA_DELATNOSTI;
      this.NAZIV_DELATNOSTI = NAZIV_DELATNOSTI;
      this.pRAVNO = pRAVNO;
   }
}