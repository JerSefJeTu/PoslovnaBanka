package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  BANKA.java
 * Author:  Aleksa
 * Purpose: Defines the Class BANKA
 ***********************************************************************/
@Entity
public class BANKA extends Model {

    @Column(nullable = false, unique = true)
    public int ID_BANKE;
    @Column(nullable = false, unique = true)
    public double SIFRA_BANKE;
    @Column(nullable = false, unique = true)
    public String NAZIV_BANKE;
    @Column(nullable = false, unique = true)
    public String ADRESA_BANKE;
    @Column(nullable = false, unique = true)
    public String TELEFON_BANKE;
    @Column(nullable = false, unique = true)
    public double PIB;
    @Column(nullable = false, unique = true)
    public String SWIFT_KOD;
    @Column(nullable = false, unique = true)
    public String OBRACUNSKI_RACUN;
    @OneToMany(mappedBy = "bANKA")
    public java.util.Collection<RACUN> rACUN;
    @OneToMany(mappedBy = "banka")
    public java.util.Collection<MT10X> mt10x;
    @OneToMany(mappedBy = "banka")
    public java.util.Collection<MT10X> mt10x2;

    public BANKA() {
    }

    public BANKA(int ID_BANKE, double SIFRA_BANKE, String NAZIV_BANKE, String ADRESA_BANKE, String TELEFON_BANKE, double PIB, String SWIFT_KOD, String OBRACUNSKI_RACUN, Collection<RACUN> rACUN, Collection<MT10X> mt10x, Collection<MT10X> mt10x2) {
        this.ID_BANKE = ID_BANKE;
        this.SIFRA_BANKE = SIFRA_BANKE;
        this.NAZIV_BANKE = NAZIV_BANKE;
        this.ADRESA_BANKE = ADRESA_BANKE;
        this.TELEFON_BANKE = TELEFON_BANKE;
        this.PIB = PIB;
        this.SWIFT_KOD = SWIFT_KOD;
        this.OBRACUNSKI_RACUN = OBRACUNSKI_RACUN;
        this.rACUN = rACUN;
        this.mt10x = mt10x;
        this.mt10x2 = mt10x2;
    }

}