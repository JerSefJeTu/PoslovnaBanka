package controllers;

import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Nalog;
import models.Racun;
import play.data.validation.Valid;
import play.mvc.Controller;

public class Placanje extends Controller {
	
	public static void show(){
		List<Racun> racuni = Racun.find("klijent_id", session.get("idKlijenta")).fetch();
        render(racuni);
	}
	
	public static void add(@Valid Nalog nalog){
		System.out.println(nalog.toString());
		System.out.println("<<<POGODJENO>>>");
	}

}
