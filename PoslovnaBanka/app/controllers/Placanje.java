package controllers;

import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Nalog;
import models.Racun;
import play.data.validation.Valid;
import play.mvc.Controller;

public class Placanje extends Controller {
	
	public static void show(long idKlijenta){
		List<Racun> racuni = Racun.find("klijent_id", idKlijenta).fetch();
    
    	
    
        render(racuni);
	}
	
	public static void add(@Valid Nalog nalog,long idKlijenta){
		
		if(validation.hasErrors()) {

			validation.keep();
            show(idKlijenta);

			}
	}

}
