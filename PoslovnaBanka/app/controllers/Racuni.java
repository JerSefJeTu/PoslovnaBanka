package controllers;

import play.mvc.Controller;
import play.mvc.With;

/**
 * Created by Djordje on 3/26/2017.
 */
@With(Secure.class)
public class Racuni extends Controller {

    public static void show(long idKlijenta){
    	System.out.println(idKlijenta);
        render();
    }

}
