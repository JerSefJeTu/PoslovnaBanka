package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Scope.Session;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
    	String username = Security.connected();
    	Session session = Scope.Session.current();
    	Klijent user = Klijent.find("username", username).first();
    	//to store values into the session
    	if(user instanceof PravnoLice)
    	{
    		PravnoLice klijent = (PravnoLice) user;
    		System.out.println();
    		session.put("naziv", klijent.naziv);
    		session.put("ime", "");
    		session.put("prezime", "");
    		
    		for (Racun racun : klijent.racuni) {
				System.out.println(racun.brojRacuna);
			}

    		Racuni.show(klijent.id);
    	}else{
    		FizickoLice klijent = (FizickoLice) user;
    		session.put("ime", klijent.ime);
    		session.put("prezime", klijent.prezime);
    		session.put("naziv", "");
    		Racuni.show(klijent.id);
    		
    		for (Racun racun : klijent.racuni) {
				System.out.println(racun.brojRacuna);
			}
    	}
    	
    	
    	
    }

}