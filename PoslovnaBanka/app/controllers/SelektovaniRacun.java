package controllers;

import dto.SelektovaniRacunDTO;
import models.*;
import play.mvc.Controller;

import javax.management.Query;
import java.util.List;

/**
 * Created by Djordje on 4/6/2017.
 */
public class SelektovaniRacun extends Controller {


    public static void show(long id){
        Racun racun = Racun.findById(id);
        List<DnevnoStanjeRacuna> dnevnoStanjeRacunaLista = DnevnoStanjeRacuna.find("racun_id", id).fetch();

        Klijent klijent = racun.klijent;
        String vlasnikRacuna = "";
        if(klijent instanceof PravnoLice) {
            vlasnikRacuna = ((PravnoLice) klijent).naziv;
        } else if (klijent instanceof FizickoLice){
            vlasnikRacuna = ((FizickoLice) klijent).ime+" "+((FizickoLice) klijent).prezime;
        }

        double stanje = 0;
        double stanjeKorist = 0;
        double stanjeMinus = 0;
        for(DnevnoStanjeRacuna dsr: dnevnoStanjeRacunaLista){
            stanje = dsr.novoStanje ;
            if(dsr.prometUKorist!=0){
                stanjeKorist=dsr.prometUKorist;
            }
            if(dsr.novoStanje<dsr.prethodnoStanje && dsr.prometUKorist==0){
                stanjeMinus = dsr.prethodnoStanje-dsr.novoStanje;
            }
        }
        int brojac = dnevnoStanjeRacunaLista.size();
        Object poslednjeDnevnoStanjeRacuna = dnevnoStanjeRacunaLista.get(brojac-1);

        DnevnoStanjeRacuna pdsr = (DnevnoStanjeRacuna) poslednjeDnevnoStanjeRacuna;
        stanje = pdsr.stanje;
        double poslednjaPromena = 0;
        String poslednjaPromenaStirng = "";
        if(stanje<pdsr.prethodnoStanje){
            poslednjaPromena =  pdsr.prethodnoStanje-pdsr.novoStanje;
            poslednjaPromenaStirng = "-"+poslednjaPromena;
        }else{
            poslednjaPromena = pdsr.prometUKorist;
            poslednjaPromenaStirng = ""+poslednjaPromena;
        }

        SelektovaniRacunDTO selektovaniRacun = new SelektovaniRacunDTO();
        selektovaniRacun.setBrojRacuna(racun.brojRacuna);
        selektovaniRacun.setDatumOtvaranjaRacuna(racun.datumOtvaranja);
        selektovaniRacun.setPoslednjaIsplata(stanjeMinus);
        selektovaniRacun.setPoslenjaUplata(stanjeKorist);
        selektovaniRacun.setStanjeRacuna(stanje);
        selektovaniRacun.setVlasnikRacuna(vlasnikRacuna);
        selektovaniRacun.setPoslenjaPromena(poslednjaPromenaStirng);

        render(selektovaniRacun);
    }
}
