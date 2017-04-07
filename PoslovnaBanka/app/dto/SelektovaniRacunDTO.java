package dto;

import java.util.Date;

/**
 * Created by Djordje on 4/7/2017.
 */
public class SelektovaniRacunDTO {

    public String brojRacuna;
    public double stanjeRacuna;
    public String vlasnikRacuna;
    public Date datumOtvaranjaRacuna;
    public String poslenjaPromena;
    public double poslenjaUplata;
    public double poslednjaIsplata;

    public SelektovaniRacunDTO() {
    }

    public SelektovaniRacunDTO(String brojRacuna, double stanjeRacuna, String vlasnikRacuna, Date datumOtvaranjaRacuna, String poslenjaPromena, double poslenjaUplata, double poslednjaIsplata) {
        this.brojRacuna = brojRacuna;
        this.stanjeRacuna = stanjeRacuna;
        this.vlasnikRacuna = vlasnikRacuna;
        this.datumOtvaranjaRacuna = datumOtvaranjaRacuna;
        this.poslenjaPromena = poslenjaPromena;
        this.poslenjaUplata = poslenjaUplata;
        this.poslednjaIsplata = poslednjaIsplata;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public String getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public void setVlasnikRacuna(String vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public Date getDatumOtvaranjaRacuna() {
        return datumOtvaranjaRacuna;
    }

    public void setDatumOtvaranjaRacuna(Date datumOtvaranjaRacuna) {
        this.datumOtvaranjaRacuna = datumOtvaranjaRacuna;
    }

    public String getPoslenjaPromena() {
        return poslenjaPromena;
    }

    public void setPoslenjaPromena(String poslenjaPromena) {
        this.poslenjaPromena = poslenjaPromena;
    }

    public double getPoslenjaUplata() {
        return poslenjaUplata;
    }

    public void setPoslenjaUplata(double poslenjaUplata) {
        this.poslenjaUplata = poslenjaUplata;
    }

    public double getPoslednjaIsplata() {
        return poslednjaIsplata;
    }

    public void setPoslednjaIsplata(double poslednjaIsplata) {
        this.poslednjaIsplata = poslednjaIsplata;
    }

    @Override
    public String toString() {
        return "SelektovaniRacunDTO{" +
                "brojRacuna='" + brojRacuna + '\'' +
                ", stanjeRacuna='" + stanjeRacuna + '\'' +
                ", vlasnikRacuna='" + vlasnikRacuna + '\'' +
                ", datumOtvaranjaRacuna='" + datumOtvaranjaRacuna + '\'' +
                ", poslenjaPromena='" + poslenjaPromena + '\'' +
                ", poslenjaUplata='" + poslenjaUplata + '\'' +
                ", poslednjaIsplata='" + poslednjaIsplata + '\'' +
                '}';
    }

}
