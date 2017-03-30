package models;

/***********************************************************************
 * Module:  Fizicko.java
 * Author:  Aleksa
 * Purpose: Defines the Class Fizicko
 ***********************************************************************/

import javax.persistence.*;

@Entity
public class Fizicko extends Klijent {

    @Column(nullable = false)
    public String ime;
    @Column(nullable = false)
    public String prezime;
    @Column(nullable = false, unique = true)
    public int JMBG;

    @OneToOne
    public Klijent klijent;

    public Fizicko() {
    }

    public Fizicko(String ime, String prezime, int JMBG) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
   }


}