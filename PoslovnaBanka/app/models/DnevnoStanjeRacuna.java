<<<<<<< Updated upstream
package models;

/***********************************************************************
 * Module:  DnevnoStanjeracuna.java
 * Author:  Aleksa
 * Purpose: Defines the Class DnevnoStanjeracuna
 ***********************************************************************/
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Entity
public class DnevnoStanjeRacuna extends Model {

   @Column(nullable = false)
   public Date datum;
   @Column(nullable = false)
   public double prethodnoStanje;
   @Column(nullable = false)
   public double prometUKorist;
   @Column(nullable = false)
   public double stanje;
   @Column(nullable = false)
   public double novoStanje;
   @OneToMany(mappedBy = "dnevnoStanjeRacuna")
   public java.util.Collection<Nalog> nalog;
   @ManyToOne
   public Racun racun;

   public DnevnoStanjeRacuna() {
   }

   public DnevnoStanjeRacuna(Date datum, double prethodnoStanje, double prometUKorist, double stanje, double novoStanje, Collection<Nalog> nalog, Racun racun) {
	   super();
      this.datum = datum;
      this.prethodnoStanje = prethodnoStanje;
      this.prometUKorist = prometUKorist;
      this.stanje = stanje;
      this.novoStanje = novoStanje;
      this.nalog = nalog;
      this.racun = racun;
   }

   @Override
   public String toString() {
      return "DnevnoStanjeRacuna{" +
              "datum=" + datum +
              ", prethodnoStanje=" + prethodnoStanje +
              ", prometUKorist=" + prometUKorist +
              ", stanje=" + stanje +
              ", novoStanje=" + novoStanje +
              ", nalog=" + nalog +
              ", racun=" + racun +
              '}';
   }
=======
package models;

/***********************************************************************
 * Module:  DnevnoStanjeracuna.java
 * Author:  Aleksa
 * Purpose: Defines the Class DnevnoStanjeracuna
 ***********************************************************************/
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class DnevnoStanjeRacuna extends Model {

   @Column(nullable = false)
   public Date datum;
   @Column(nullable = false)
   public double prethodnoStanje;
   @Column(nullable = false)
   public double prometUKorist;
   @Column(nullable = false)
   public double novoStanje;
   @OneToMany(mappedBy = "dnevnoStanjeRacuna")
   public List<Nalog> nalog;
   @ManyToOne
   public Racun racun;

   public DnevnoStanjeRacuna() {
   }

   public DnevnoStanjeRacuna(Date datum, double prethodnoStanje, double prometUKorist, double novoStanje, List<Nalog> nalog, Racun racun) {
	   super();
      this.datum = datum;
      this.prethodnoStanje = prethodnoStanje;
      this.prometUKorist = prometUKorist;
      this.novoStanje = novoStanje;
      this.nalog = nalog;
      this.racun = racun;
   }

   @Override
   public String toString() {
      return "DnevnoStanjeRacuna{" +
              "datum=" + datum +
              ", prethodnoStanje=" + prethodnoStanje +
              ", prometUKorist=" + prometUKorist +
              ", novoStanje=" + novoStanje +
              ", nalog=" + nalog +
              ", racun=" + racun +
              '}';
   }
>>>>>>> Stashed changes
}