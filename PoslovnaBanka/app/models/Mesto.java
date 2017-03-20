package models;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Mesto{

    @Column(unique=true, nullable=false)
    public int postanskiBroj;
    @Column(unique=true, nullable=false)
    public String naziv;

    @OneToMany
    public List<Klijent> klijenti;


}