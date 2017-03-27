package models;

/***********************************************************************
 * Module:  DNEVNO_STANJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class DNEVNO_STANJE_RACUNA
 ***********************************************************************/
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Entity
public class DNEVNO_STANJE_RACUNA extends Model {
   @Column(nullable = false, unique = true)
   public int ID_DNEVNOG_STANJA;
   @Column(nullable = false)
   public Date DATUM_;
   @Column(nullable = false)
   public double PRETHODNO_STANJE;
   @Column(nullable = false)
   public double PROMET_U_KORIST;
   @Column(nullable = false)
   public double STANJE_;
   @Column(nullable = false)
   public double NOVO_STANJE;
   @OneToMany(mappedBy = "dNEVNO_STANJE_RACUNA")
   public java.util.Collection<NALOG> nALOG;
   @ManyToOne
   public RACUN rACUN;

   public DNEVNO_STANJE_RACUNA() {
   }

   public DNEVNO_STANJE_RACUNA(int ID_DNEVNOG_STANJA, Date DATUM_, double PRETHODNO_STANJE, double PROMET_U_KORIST, double STANJE_, double NOVO_STANJE, Collection<NALOG> nALOG, RACUN rACUN) {
      this.ID_DNEVNOG_STANJA = ID_DNEVNOG_STANJA;
      this.DATUM_ = DATUM_;
      this.PRETHODNO_STANJE = PRETHODNO_STANJE;
      this.PROMET_U_KORIST = PROMET_U_KORIST;
      this.STANJE_ = STANJE_;
      this.NOVO_STANJE = NOVO_STANJE;
      this.nALOG = nALOG;
      this.rACUN = rACUN;
   }
}