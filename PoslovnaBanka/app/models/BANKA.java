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

    /** @pdGenerated default getter */
    public java.util.Collection<RACUN> getRACUN() {
        if (rACUN == null){
            rACUN = new java.util.HashSet<RACUN>();
        }
        return rACUN;
    }

    /** @pdGenerated default iterator getter */
    public java.util.Iterator getIteratorRACUN() {
        if (rACUN == null){
            rACUN = new java.util.HashSet<RACUN>();
        }
        return rACUN.iterator();
    }

    /** @pdGenerated default setter
    * @param newRACUN */
    public void setRACUN(java.util.Collection<RACUN> newRACUN) {
        removeAllRACUN();
        for (java.util.Iterator iter = newRACUN.iterator(); iter.hasNext();){
            addRACUN((RACUN)iter.next());
        }
    }

    /** @pdGenerated default add
    * @param newRACUN */
    public void addRACUN(RACUN newRACUN) {
        if (newRACUN == null){
            return;
        }
        if (this.rACUN == null){
            this.rACUN = new java.util.HashSet<RACUN>();
        }
        if (!this.rACUN.contains(newRACUN))
        {
            this.rACUN.add(newRACUN);
            newRACUN.setBANKA(this);
        }
    }

    /** @pdGenerated default remove
    * @param oldRACUN */
    public void removeRACUN(RACUN oldRACUN) {
        if (oldRACUN == null){
            return;
        }
        if (this.rACUN != null){

        }
        if (this.rACUN.contains(oldRACUN))
        {
            this.rACUN.remove(oldRACUN);
            oldRACUN.setBANKA((BANKA)null);
        }
    }

    /** @pdGenerated default removeAll */
    public void removeAllRACUN() {
        if (rACUN != null)
        {
            RACUN oldRACUN;
            for (java.util.Iterator iter = getIteratorRACUN(); iter.hasNext();)
            {
                oldRACUN = (RACUN)iter.next();
                iter.remove();
                oldRACUN.setBANKA((BANKA)null);
            }
        }
    }

    /** @pdGenerated default getter */
    public java.util.Collection<MT10X> getMt10x() {
        if (mt10x == null){
            mt10x = new java.util.HashSet<MT10X>();
        }
        return mt10x;
    }

    /** @pdGenerated default iterator getter */
    public java.util.Iterator getIteratorMt10x() {
        if (mt10x == null){
            mt10x = new java.util.HashSet<MT10X>();
        }
        return mt10x.iterator();
    }

    /** @pdGenerated default setter
    * @param newMt10x */
    public void setMt10x(java.util.Collection<MT10X> newMt10x) {
        removeAllMt10x();
        for (java.util.Iterator iter = newMt10x.iterator(); iter.hasNext();){
            addMt10x((MT10X)iter.next());
        }
    }

    /** @pdGenerated default add
    * @param newMT10X */
    public void addMt10x(MT10X newMT10X) {
        if (newMT10X == null){
            return;
        }
        if (this.mt10x == null){
            this.mt10x = new java.util.HashSet<MT10X>();
        }
        if (!this.mt10x.contains(newMT10X))
        {
            this.mt10x.add(newMT10X);
            newMT10X.setBanka(this);
        }
    }

    /** @pdGenerated default remove
    * @param oldMT10X */
    public void removeMt10x(MT10X oldMT10X) {
        if (oldMT10X == null){
            return;
        }
        if (this.mt10x != null){

        }
        if (this.mt10x.contains(oldMT10X))
        {
            this.mt10x.remove(oldMT10X);
            oldMT10X.setBanka((BANKA)null);
        }
    }

    /** @pdGenerated default removeAll */
    public void removeAllMt10x() {
        if (mt10x != null)
        {
            MT10X oldMT10X;
            for (java.util.Iterator iter = getIteratorMt10x(); iter.hasNext();)
            {
                oldMT10X = (MT10X)iter.next();
                iter.remove();
                oldMT10X.setBanka((BANKA)null);
            }
        }
    }

    /** @pdGenerated default getter */
    public java.util.Collection<MT10X> getMt10x2() {
        if (mt10x2 == null){
            mt10x2 = new java.util.HashSet<MT10X>();
        }
        return mt10x2;
    }

    /** @pdGenerated default iterator getter */
    public java.util.Iterator getIteratorMt10x2() {
        if (mt10x2 == null)
        {
            mt10x2 = new java.util.HashSet<MT10X>();
        }
        return mt10x2.iterator();
    }

    /** @pdGenerated default setter
    * @param newMt10x2 */
    public void setMt10x2(java.util.Collection<MT10X> newMt10x2) {
        removeAllMt10x2();
        for (java.util.Iterator iter = newMt10x2.iterator(); iter.hasNext();){
            addMt10x2((MT10X)iter.next());
        }
    }

    /** @pdGenerated default add
    * @param newMT10X */
    public void addMt10x2(MT10X newMT10X) {
        if (newMT10X == null){
            return;
        }
        if (this.mt10x2 == null){
            this.mt10x2 = new java.util.HashSet<MT10X>();
        }
        if (!this.mt10x2.contains(newMT10X))
        {
            this.mt10x2.add(newMT10X);
            newMT10X.setBanka2(this);
        }
    }

    /** @pdGenerated default remove
    * @param oldMT10X */
    public void removeMt10x2(MT10X oldMT10X) {
        if (oldMT10X == null)
        {
            return;
        }
        if (this.mt10x2 != null)
        {

        }
        if (this.mt10x2.contains(oldMT10X))
        {
            this.mt10x2.remove(oldMT10X);
            oldMT10X.setBanka2((BANKA)null);
        }
    }

    /** @pdGenerated default removeAll */
    public void removeAllMt10x2() {
        if (mt10x2 != null)
        {
            MT10X oldMT10X;
            for (java.util.Iterator iter = getIteratorMt10x2(); iter.hasNext();)
            {
                oldMT10X = (MT10X)iter.next();
                iter.remove();
                oldMT10X.setBanka2((BANKA)null);
            }
        }
    }

}