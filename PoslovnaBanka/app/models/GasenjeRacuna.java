package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class GasenjeRacuna{
    @Column(unique=true, nullable=false)
    public Date datumGasanje;
    @Column(unique=true, nullable=false)
    public String prenosNaRacu;

    @Column(unique=true, nullable=false)
    public Racun racun;

    public Date getDatumGasanje() {
        return datumGasanje;
    }

    public void setDatumGasanje(Date datumGasanje) {
        this.datumGasanje = datumGasanje;
    }

    public String getPrenosNaRacu() {
        return prenosNaRacu;
    }

    public void setPrenosNaRacu(String prenosNaRacu) {
        this.prenosNaRacu = prenosNaRacu;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public GasenjeRacuna(Date datumGasanje, String prenosNaRacu, Racun racun) {
        this.datumGasanje = datumGasanje;
        this.prenosNaRacu = prenosNaRacu;
        this.racun = racun;
    }

    public GasenjeRacuna() {
    }

//fali veza ka racunu
}