package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

/***********************************************************************
 * Module:  Delatnost.java
 * Author:  Aleksa
 * Purpose: Defines the Class Delatnost
 ***********************************************************************/
@Entity
public class Delatnost extends Model {

   @Column(nullable = false, unique = true)
   public int sifraDelatnosti;
   @Column(nullable = false, unique = true)
   public String nazivDelatnosti;
   //@OneToMany(mappedBy = "delatnost")
   //public List<Delatnost> listaDelatnosti;


   public Delatnost() {
   }

   public Delatnost(int sifraDelatnosti, String nazivDelatnosti) {
	   super();
      this.sifraDelatnosti = sifraDelatnosti;
      this.nazivDelatnosti = nazivDelatnosti;
   }

   
}