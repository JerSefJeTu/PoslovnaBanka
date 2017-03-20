package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Banka{

    @Column(unique=true, nullable=false)
    public int sifraBanke;
    @Column(unique=true, nullable=false)
    public String nazivBanke;
    @Column(nullable=false)
    public String adresaBanke;
    @Column(nullable=false)
    public String telefonskiBroj;
    @Column(unique=true, nullable=false)
    public int pib;
    @Column(unique=true, nullable=false)
    public String swiftKodbanke;
    @Column(unique=true, nullable=false)
    public String obracunskiRacun;

    @OneToMany
    public List<MT10x> mt10xs;

    @OneToMany
    public List<Racun> racuni;

    public int getSifraBanke() {
        return sifraBanke;
    }

    public void setSifraBanke(int sifraBanke) {
        this.sifraBanke = sifraBanke;
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public String getAdresaBanke() {
        return adresaBanke;
    }

    public void setAdresaBanke(String adresaBanke) {
        this.adresaBanke = adresaBanke;
    }

    public String getTelefonskiBroj() {
        return telefonskiBroj;
    }

    public void setTelefonskiBroj(String telefonskiBroj) {
        this.telefonskiBroj = telefonskiBroj;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public String getSwiftKodbanke() {
        return swiftKodbanke;
    }

    public void setSwiftKodbanke(String swiftKodbanke) {
        this.swiftKodbanke = swiftKodbanke;
    }

    public String getObracunskiRacun() {
        return obracunskiRacun;
    }

    public void setObracunskiRacun(String obracunskiRacun) {
        this.obracunskiRacun = obracunskiRacun;
    }

    public List<MT10x> getMt10x() {
        return mt10x;
    }

    public void setMt10x(List<MT10x> mt10x) {
        this.mt10x = mt10x;
    }

    public List<Racun> getRacun() {
        return racun;
    }

    public void setRacun(List<Racun> racun) {
        this.racun = racun;
    }

    public Banka(int sifraBanke, String nazivBanke, String adresaBanke, String telefonskiBroj, int pib, String swiftKodbanke, String obracunskiRacun, List<MT10x> mt10x, List<Racun> racun) {
        this.sifraBanke = sifraBanke;
        this.nazivBanke = nazivBanke;
        this.adresaBanke = adresaBanke;
        this.telefonskiBroj = telefonskiBroj;
        this.pib = pib;
        this.swiftKodbanke = swiftKodbanke;
        this.obracunskiRacun = obracunskiRacun;
        this.mt10x = mt10x;
        this.racun = racun;
    }

    public Banka() {
    }


//fale veze ka MT10x, ka Racunu,
}