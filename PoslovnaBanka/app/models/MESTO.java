package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/***********************************************************************
 * Module:  MESTO.java
 * Author:  Aleksa
 * Purpose: Defines the Class MESTO
 ***********************************************************************/
@Entity
public class MESTO extends Model {

    @Column(nullable = false, unique = true)
    public int POSTANSKI_BROJ;
    @Column(nullable = false)
    public String NAZIV;

    public MESTO() {
    }

    public MESTO(int POSTANSKI_BROJ, String NAZIV, Collection<KLIJENT> kLIJENT) {
        this.POSTANSKI_BROJ = POSTANSKI_BROJ;
        this.NAZIV = NAZIV;
    }
}