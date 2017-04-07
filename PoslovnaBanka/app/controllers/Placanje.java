package controllers;

import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Racun;
import play.mvc.Controller;

public class Placanje extends Controller {
	
	public static void show(long idKlijenta){
		List<Racun> racuni = Racun.find("klijent_id", idKlijenta).fetch();
    
    	
    
        render(racuni);
	}

}
