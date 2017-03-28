package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/***********************************************************************
 * Module:  Mesto.java
 * Author:  Aleksa
 * Purpose: Defines the Class Mesto
 ***********************************************************************/
@Entity
public class Mesto extends Model {

    @Column(nullable = false, unique = true)
    public int postanskiBroj;
    @Column(nullable = false)
    public String naziv;

    public Mesto() {
    }

    public Mesto(int postanskiBroj, String naziv) {
        super();
    	this.postanskiBroj = postanskiBroj;
        this.naziv = naziv;
    }
}