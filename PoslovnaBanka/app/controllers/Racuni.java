package controllers;

import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Klijent;
import models.Racun;
import play.data.validation.Required;
import play.mvc.Controller;
import play.mvc.With;

/**
 * Created by Djordje on 3/26/2017.
 */
@With(Secure.class)
public class Racuni extends Controller {

    public static void show(){
    	List<Racun> racuni = Racun.find("klijent_id", session.get("idKlijenta")).fetch();
        System.out.println(racuni);
        render(racuni);
    }

    public static void filter(@Required String brojRacuna){
        List<Racun> delatnosti = Racun.find("byBROJ_RACUNALike", "%"+ brojRacuna +"%").fetch();
        String mode = "edit";
        renderTemplate("Racuni/admin_show.html", delatnosti, mode);
    }

    public static void admin_show(String mode){
        List<Racun> racuni = Racun.findAll();
        System.out.println(racuni);
        render(racuni);
    }

    public static void delete(long id){
        Racun racun = Racun.findById(id);
        System.out.println(id);
        racun.delete();
        show();
    }

    public static void add(@Required String brojRacuna, String datumOtvaranja, String klijent){
        System.out.println(brojRacuna);
        System.out.println(datumOtvaranja);
        System.out.println("k:"+klijent);
    }

}
