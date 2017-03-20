package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class DnevnoStanjeRacuna{

    @Column(unique=true, nullable=false)
    public Date datumStanja;
    @Column(unique=true, nullable=false)
    public float prehodnoStanje;
    @Column(unique=true, nullable=false)
    public float prometUKorist;
    @Column(unique=true, nullable=false)
    public float prometNaTeret;
    @Column(unique=true, nullable=false)
    public float novoStanje;

    @ManyToOne
    public Nalog nalog;

    @ManyToOne
    public Racun racun;

    public Date getDatumStanja() {
        return datumStanja;
    }

    public void setDatumStanja(Date datumStanja) {
        this.datumStanja = datumStanja;
    }

    public float getPrehodnoStanje() {
        return prehodnoStanje;
    }

    public void setPrehodnoStanje(float prehodnoStanje) {
        this.prehodnoStanje = prehodnoStanje;
    }

    public float getPrometUKorist() {
        return prometUKorist;
    }

    public void setPrometUKorist(float prometUKorist) {
        this.prometUKorist = prometUKorist;
    }

    public float getPrometNaTeret() {
        return prometNaTeret;
    }

    public void setPrometNaTeret(float prometNaTeret) {
        this.prometNaTeret = prometNaTeret;
    }

    public float getNovoStanje() {
        return novoStanje;
    }

    public void setNovoStanje(float novoStanje) {
        this.novoStanje = novoStanje;
    }

    public Nalog getNalog() {
        return nalog;
    }

    public void setNalog(Nalog nalog) {
        this.nalog = nalog;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public DnevnoStanjeRacuna(Date datumStanja, float prehodnoStanje, float prometUKorist, float prometNaTeret, float novoStanje, Nalog nalog, Racun racun) {
        this.datumStanja = datumStanja;
        this.prehodnoStanje = prehodnoStanje;
        this.prometUKorist = prometUKorist;
        this.prometNaTeret = prometNaTeret;
        this.novoStanje = novoStanje;
        this.nalog = nalog;
        this.racun = racun;
    }

    public DnevnoStanjeRacuna() {
    }

    //fale veze ka nalogu i ka racunu
}