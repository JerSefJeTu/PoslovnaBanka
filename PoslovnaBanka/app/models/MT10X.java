package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

/***********************************************************************
 * Module:  MT10X.java
 * Author:  Aleksa
 * Purpose: Defines the Class MT10X
 ***********************************************************************/
@Entity
public class MT10X extends Model {
   @Column(nullable = false)
   public Date datum;
   @Column(nullable = false)
   public double ukupanIznos;
   @Column(nullable = false)
   public String vrstaPoruke;
   @Column(nullable = false)
   public String swiftKod1;
   @Column(nullable = false)
   public String swiftKod2;
   @Column(nullable = false)
   public String obracunskiRacun1;
   @Column(nullable = false)
   public String obracunskiRacun2;
   @Column(nullable = false)
   public boolean obradjeno;
   @OneToMany(mappedBy = "mt10x")
   public java.util.Collection<Nalog> nalog;
   @ManyToOne
   public Clearing clearing;

   public MT10X() {
   }

   public MT10X(Date datum, double ukupanIznos, String vrstaPoruke, String swiftKod1, String swiftKod2, String obracunskiRacun1, String obracunskiRacun2, boolean obradjeno, Collection<Nalog> nalog) {
      super();
	   this.datum = datum;
      this.ukupanIznos = ukupanIznos;
      this.vrstaPoruke = vrstaPoruke;
      this.swiftKod1 = swiftKod1;
      this.swiftKod2 = swiftKod2;
      this.obracunskiRacun1 = obracunskiRacun1;
      this.obracunskiRacun2 = obracunskiRacun2;
      this.obradjeno = obradjeno;
      this.nalog = nalog;
   }
}