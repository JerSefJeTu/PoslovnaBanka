package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Delatnost{

    @Column(unique=true, nullable=false)
    public int sifraDelatnosti;

    @Column(unique=true, nullable=false)
    public String nazivDelatnosti;

    @OneToMany
    public List<PravnoLice> pravnoLice;

    public int getSifraDelatnosti() {
        return sifraDelatnosti;
    }

    public void setSifraDelatnosti(int sifraDelatnosti) {
        this.sifraDelatnosti = sifraDelatnosti;
    }

    public String getNazivDelatnosti() {
        return nazivDelatnosti;
    }

    public void setNazivDelatnosti(String nazivDelatnosti) {
        this.nazivDelatnosti = nazivDelatnosti;
    }

    public List<PravnoLice> getPravnoLice() {
        return pravnoLice;
    }

    public void setPravnoLice(List<PravnoLice> pravnoLice) {
        this.pravnoLice = pravnoLice;
    }

    public Delatnost(int sifraDelatnosti, String nazivDelatnosti, List<PravnoLice> pravnoLice) {
        this.sifraDelatnosti = sifraDelatnosti;
        this.nazivDelatnosti = nazivDelatnosti;
        this.pravnoLice = pravnoLice;
    }

    public Delatnost() {
    }

//fali veza ka pravnom licu
}