package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Klijent{

    @Column(unique=true, nullable=false)
    public String adresa;
    @Column(unique=true, nullable=false)
    public String telefon;
    @Column(unique=true, nullable=false)
    public String fax;
    @Column(unique=true, nullable=false)
    public String email;
    @Column(unique=true, nullable=false)
    public String korisnickoIme;
    @Column(unique=true, nullable=false)
    public String password;
    //fali veza ka adresi, ka fizickom i pravom licu, i ka racunu


    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Klijent(String adresa, String telefon, String fax, String email, String korisnickoIme, String password) {
        this.adresa = adresa;
        this.telefon = telefon;
        this.fax = fax;
        this.email = email;
        this.korisnickoIme = korisnickoIme;
        this.password = password;
    }

    public Klijent() {
    }
}