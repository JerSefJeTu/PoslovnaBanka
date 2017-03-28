package models;

/***********************************************************************
 * Module:  DnevnoStanjeracuna.java
 * Author:  Aleksa
 * Purpose: Defines the Class DnevnoStanjeracuna
 ***********************************************************************/
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
   @OneToMany(mappedBy = "dnevnoStanjeracuna")
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
   
}