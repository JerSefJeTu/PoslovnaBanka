package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
@Entity
public class Nalog{

    @Column(unique=true, nullable=false)
    public String racunDuznika;
    @Column(unique=true, nullable=false)
    public String racunPoverioca;
    @Column(unique=true, nullable=false)
    public String pozivNaBrojZaduzenja;
    @Column(unique=true, nullable=false)
    public String pozivNaBrojOdobrenja;
    @Column(unique=true, nullable=false)
    public int modelZaduzenja;
    @Column(unique=true, nullable=false)
    public int modelOdobrenja;
    @Column(unique=true, nullable=false)
    public float iznos;
    @Column(unique=true, nullable=false)
    public String duznik;
    @Column(unique=true, nullable=false)
    public String primalac;
    @Column(unique=true, nullable=false)
    public String svrhaUplate;
    @Column(unique=true, nullable=false)
    public Date datum;

    @OneToMany
    public DnevnoStanjeRacuna dnevnoStanjeRacuna;

    @ManyToOne
    public List<MT10X> listaMTx;

    public String getRacunDuznika() {
        return racunDuznika;
    }

    public void setRacunDuznika(String racunDuznika) {
        this.racunDuznika = racunDuznika;
    }

    public String getRacunPoverioca() {
        return racunPoverioca;
    }

    public void setRacunPoverioca(String racunPoverioca) {
        this.racunPoverioca = racunPoverioca;
    }

    public String getPozivNaBrojZaduzenja() {
        return pozivNaBrojZaduzenja;
    }

    public void setPozivNaBrojZaduzenja(String pozivNaBrojZaduzenja) {
        this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
    }

    public String getPozivNaBrojOdobrenja() {
        return pozivNaBrojOdobrenja;
    }

    public void setPozivNaBrojOdobrenja(String pozivNaBrojOdobrenja) {
        this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
    }

    public int getModelZaduzenja() {
        return modelZaduzenja;
    }

    public void setModelZaduzenja(int modelZaduzenja) {
        this.modelZaduzenja = modelZaduzenja;
    }

    public int getModelOdobrenja() {
        return modelOdobrenja;
    }

    public void setModelOdobrenja(int modelOdobrenja) {
        this.modelOdobrenja = modelOdobrenja;
    }

    public float getIznos() {
        return iznos;
    }

    public void setIznos(float iznos) {
        this.iznos = iznos;
    }

    public String getDuznik() {
        return duznik;
    }

    public void setDuznik(String duznik) {
        this.duznik = duznik;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public DnevnoStanjeRacuna getDnevnoStanjeRacuna() {
        return dnevnoStanjeRacuna;
    }

    public void setDnevnoStanjeRacuna(DnevnoStanjeRacuna dnevnoStanjeRacuna) {
        this.dnevnoStanjeRacuna = dnevnoStanjeRacuna;
    }

    public List<MT10X> getListaMTx() {
        return listaMTx;
    }

    public void setListaMTx(List<MT10X> listaMTx) {
        this.listaMTx = listaMTx;
    }

    public Nalog(String racunDuznika, String racunPoverioca, String pozivNaBrojZaduzenja, String pozivNaBrojOdobrenja, int modelZaduzenja, int modelOdobrenja, float iznos, String duznik, String primalac, String svrhaUplate, Date datum, DnevnoStanjeRacuna dnevnoStanjeRacuna, List<MT10X> listaMTx) {
        this.racunDuznika = racunDuznika;
        this.racunPoverioca = racunPoverioca;
        this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
        this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
        this.modelZaduzenja = modelZaduzenja;
        this.modelOdobrenja = modelOdobrenja;
        this.iznos = iznos;
        this.duznik = duznik;
        this.primalac = primalac;
        this.svrhaUplate = svrhaUplate;
        this.datum = datum;
        this.dnevnoStanjeRacuna = dnevnoStanjeRacuna;
        this.listaMTx = listaMTx;
    }

    public Nalog() {
    }
}
//fale veze ka dnevnoStanjeRacuna, ka MTx,