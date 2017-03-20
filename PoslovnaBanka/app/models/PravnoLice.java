package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PravnoLice extends Klijent{

    @Column(unique=true, nullable=false)
    public String naziv;
    @Column(unique=true, nullable=false)
    public int pib;
    @Column(unique=true, nullable=false)
    public int maticniBroj;

    @ManyToOne
    public Delatnost delatnost;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public int getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(int maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public Delatnost getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(Delatnost delatnost) {
        this.delatnost = delatnost;
    }

    public PravnoLice(String naziv, int pib, int maticniBroj, Delatnost delatnost) {
        this.naziv = naziv;
        this.pib = pib;
        this.maticniBroj = maticniBroj;
        this.delatnost = delatnost;
    }

    public PravnoLice() {
    }

//fali veza ka zanimanju
}