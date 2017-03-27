package controllers;

import models.DELATNOST;
import play.data.validation.Error;
import play.data.validation.Required;
import play.mvc.Controller;
import java.util.List;

/**
 * Created by Djordje on 3/27/2017.
 */
public class Delatnosti extends Controller {

    public static void show(String mode){
        List<DELATNOST> delatnosti = DELATNOST.findAll();
        if (mode == null || mode.equals(""))
            mode = "edit";
        render(delatnosti, mode);
    }
    public static void add(@Required String nazivDelatnosti, int sifraDelatnosti) {
        if(validation.hasErrors()) {
            for(Error error : validation.errors()) {
                System.out.println(error.message());
            }
            validation.keep();
            show("add");
        }else {
            DELATNOST delatnost =new DELATNOST();
            delatnost.NAZIV_DELATNOSTI = nazivDelatnosti;
            delatnost.SIFRA_DELATNOSTI = sifraDelatnosti;
            delatnost.save();
            validation.keep();
            show("add");
        }
    }
    public static void filter(@Required String nazivDelatnosti){
        List<DELATNOST> delatnosti = DELATNOST.find("byNAZIV_DELATNOSTILike", "%"+ nazivDelatnosti +"%").fetch();
        String mode = "edit";
        renderTemplate("Delatnosti/show.html", delatnosti, mode);
    }
    public static void edit(@Required String nazivDelatnosti, int sifraDelatnosti, long id){
        DELATNOST delatnost = DELATNOST.findById(id);
        delatnost.NAZIV_DELATNOSTI=nazivDelatnosti;
        delatnost.SIFRA_DELATNOSTI=sifraDelatnosti;
        delatnost.save();
        show("");
    }
    public static void delete(long id){
        DELATNOST delatnost = DELATNOST.findById(id);
        System.out.println(id);
        delatnost.delete();
        show("");
    }

}