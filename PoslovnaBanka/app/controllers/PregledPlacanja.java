package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.DnevnoStanjeRacuna;
import models.Nalog;
import play.mvc.Controller;

public class PregledPlacanja extends Controller {

	public static void show(ArrayList<Object> nalozi){
		if(nalozi==null){
			render();
		}else{
			render(nalozi);
		}
	}
	
	public static void filter(Date pocetniDatum, Date krajnjiDatum){
//		ArrayList<Object> nalozi=(ArrayList<Object>) Nalog.find("SELECT n FROM Nalog n WHERE dnevnoStanjeRacuna_id in (SELECT dsr.id FROM DnevnoStanjeRacuna dsr where datum >='"+pocetniDatum+"' and datum <= '"+krajnjiDatum+"')").fetch();
//		ArrayList<Object> nalozi=(ArrayList<Object>) DnevnoStanjeRacuna.find("SELECT d FROM DnevnoStanjeRacuna d where datum >='"+pocetniDatum+"' and datum <= '"+krajnjiDatum+"')").fetch();
//		System.out.println(nalozi);
//		ArrayList<Object> nalozi=(ArrayList<Object>) Nalog.find("SELECT n from Nalog n where dnevnoStanjeRacuna_id in (SELECT id from DnevnoStanjeRacuna dsr where datum >='"+pocetniDatum+"' and datum <= '"+krajnjiDatum+"')").fetch();
//		System.out.println(nalozi.size());
		ArrayList<Object> dnevnaStanja= (ArrayList<Object>) DnevnoStanjeRacuna.find("byRacun_idLikeAndDatumGreaterThanEqualsAndDatumLessThanEquals", session.get("idRacuna"),pocetniDatum,krajnjiDatum).fetch();
		List<Long> idDnevnihStanja=new ArrayList<>();
		for (Object o : dnevnaStanja) {
			idDnevnihStanja.add(((DnevnoStanjeRacuna)o).id);
		}
		System.out.println(idDnevnihStanja);
		ArrayList<Object> naloziDnevnogStanja=(ArrayList<Object>) Nalog.find("byDnevnoStanjeRacuna_idLike", idDnevnihStanja).fetch();
		show(naloziDnevnogStanja);
	}
	
}
