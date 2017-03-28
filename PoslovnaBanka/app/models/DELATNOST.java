package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
   public double SIFRA_DELATNOSTI;
   @Column(nullable = false, unique = true)
   public String NAZIV_DELATNOSTI;


   public DELATNOST() {
   }

   public DELATNOST(double SIFRA_DELATNOSTI, String NAZIV_DELATNOSTI) {
      this.SIFRA_DELATNOSTI = SIFRA_DELATNOSTI;
      this.NAZIV_DELATNOSTI = NAZIV_DELATNOSTI;
   }

   
}