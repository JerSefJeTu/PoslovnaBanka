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
	
	public static void add(Nalog nalog){

		System.out.println("<<<POGODJENO>>>");

		System.out.println(nalog.duznik);
		System.out.println(nalog.iznos);
		System.out.println(nalog.datumNaloga);
		System.out.println(nalog.duznik);
		System.out.println(nalog.racunPoverioca);
		System.out.println(nalog.primalac);

		for(play.data.validation.Error error : validation.errors()) {


			System.out.println(error.message());
			validation.keep();
			//show(idKlijenta);

		}

		System.out.println(nalog.iznos);
		//System.out.println(idKlijenta);

		if(validation.hasErrors()) {

			validation.keep();
            //show(idKlijenta);

			}
	}

}
