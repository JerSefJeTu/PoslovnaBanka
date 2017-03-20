package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Racun{
    @Column(unique=true, nullable=false)
    public String brojRacuna;

    @OneToMany
    public List<DnevnoStanjeRacuna> dnevnoStanjeRacunaList;

    public GasenjeRacuna gasenjeRacuna;

    @ManyToOne
    public Banka banka;

    @ManyToOne
    public Klijent klijent;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public List<DnevnoStanjeRacuna> getDnevnoStanjeRacunaList() {
        return dnevnoStanjeRacunaList;
    }

    public void setDnevnoStanjeRacunaList(List<DnevnoStanjeRacuna> dnevnoStanjeRacunaList) {
        this.dnevnoStanjeRacunaList = dnevnoStanjeRacunaList;
    }

    public GasenjeRacuna getGasenjeRacuna() {
        return gasenjeRacuna;
    }

    public void setGasenjeRacuna(GasenjeRacuna gasenjeRacuna) {
        this.gasenjeRacuna = gasenjeRacuna;
    }

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Racun(String brojRacuna, List<DnevnoStanjeRacuna> dnevnoStanjeRacunaList, GasenjeRacuna gasenjeRacuna, Banka banka, Klijent klijent) {
        this.brojRacuna = brojRacuna;
        this.dnevnoStanjeRacunaList = dnevnoStanjeRacunaList;
        this.gasenjeRacuna = gasenjeRacuna;
        this.banka = banka;
        this.klijent = klijent;
    }

    public Racun() {
    }

//fale veze ka dnevnomStanjuRacuna, ka gasenjuRacuna, ka banci i ka klijentu
}