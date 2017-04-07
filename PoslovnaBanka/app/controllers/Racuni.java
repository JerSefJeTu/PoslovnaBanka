package controllers;

import models.Racun;
import play.mvc.Controller;
import play.mvc.With;

import java.util.List;

/**
 * Created by Djordje on 3/26/2017.
 */
@With(Secure.class)
public class Racuni extends Controller {

    public static void show(String mode){
        List<Racun> racuni=Racun.findAll();
        render(mode,racuni);
    }

}
