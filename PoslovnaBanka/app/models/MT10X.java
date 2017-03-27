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
   @Column(nullable = false, unique = true)
   public int ID_PORUKE;
   @Column(nullable = false)
   public Date DATUM_;
   @Column(nullable = false)
   public double UKUPAN_IZNOS;
   @Column(nullable = false)
   public String VRSTA_PORUKE;
   @Column(nullable = false)
   public String SWIFT_KOD1;
   @Column(nullable = false)
   public String SWIFT_KOD2;
   @Column(nullable = false)
   public String OBRACUNSKI_RACUN1;
   @Column(nullable = false)
   public String OBRACUNSKI_RACUN2;
   @Column(nullable = false)
   public boolean OBRADJENO;
   @OneToMany(mappedBy = "mT10X")
   public java.util.Collection<NALOG> nALOG;
   @ManyToOne
   public BANKA banka;
   @ManyToOne
   public BANKA banka2;

   public MT10X() {
   }

   public MT10X(int ID_PORUKE, Date DATUM_, double UKUPAN_IZNOS, String VRSTA_PORUKE, String SWIFT_KOD1, String SWIFT_KOD2, String OBRACUNSKI_RACUN1, String OBRACUNSKI_RACUN2, boolean OBRADJENO, Collection<NALOG> nALOG, BANKA banka, BANKA banka2) {
      this.ID_PORUKE = ID_PORUKE;
      this.DATUM_ = DATUM_;
      this.UKUPAN_IZNOS = UKUPAN_IZNOS;
      this.VRSTA_PORUKE = VRSTA_PORUKE;
      this.SWIFT_KOD1 = SWIFT_KOD1;
      this.SWIFT_KOD2 = SWIFT_KOD2;
      this.OBRACUNSKI_RACUN1 = OBRACUNSKI_RACUN1;
      this.OBRACUNSKI_RACUN2 = OBRACUNSKI_RACUN2;
      this.OBRADJENO = OBRADJENO;
      this.nALOG = nALOG;
      this.banka = banka;
      this.banka2 = banka2;
   }
}