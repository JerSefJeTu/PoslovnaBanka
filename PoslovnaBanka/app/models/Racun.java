package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  Racun.java
 * Author:  Aleksa
 * Purpose: Defines the Class Racun
 ***********************************************************************/
@Entity
public class Racun extends Model {
   @Column(nullable = false, unique = true)
   public String brojRacuna;
   @OneToMany(mappedBy = "racun")
   public java.util.Collection<DnevnoStanjeRacuna> dnevnoStanjeRacuna;
   @ManyToOne
   public Banka banka;

   @ManyToOne
   public Klijent klijent;

   public Racun() {
   }

   public Racun(String brojRacuna, Collection<DnevnoStanjeRacuna> dnevnoStanjeRacuna, Banka banka) {
      super();
	   this.brojRacuna = brojRacuna;
      this.dnevnoStanjeRacuna = dnevnoStanjeRacuna;
      this.banka = banka;
   }
}