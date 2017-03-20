package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FizickoLice extends Klijent{
    @Column(unique=true, nullable=false)
    public String ime;
    @Column(unique=true, nullable=false)
    public String prezime;
    @Column(unique=true, nullable=false)
    public long jmbg;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String ime, String prezime, long jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }

    public FizickoLice() {
    }
}