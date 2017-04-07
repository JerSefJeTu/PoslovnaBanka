package controllers;

import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Klijent;
import models.Racun;
import play.mvc.Controller;
import play.mvc.With;

/**
 * Created by Djordje on 3/26/2017.
 */
@With(Secure.class)
public class Racuni extends Controller {

    public static void show(long idKlijenta){
    	List<Racun> racuni = Racun.find("klijent_id", idKlijenta).fetch();
  
    	
    
        render(racuni);
    }

}
