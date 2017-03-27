package controllers;

import models.MESTO;
import play.data.validation.Error;
import play.data.validation.Required;
import play.mvc.Controller;

import java.util.List;
/**
 * Created by Djordje on 3/27/2017.
 */
public class Mesta extends Controller {

    public static void show(String mode){
        List<MESTO>mesta=MESTO.findAll();
        if (mode == null || mode.equals(""))
            mode = "edit";
        render(mesta, mode);
    }
    public static void add(@Required String nazivMesta, int postanskiBroj) {
        System.out.println(nazivMesta+" "+postanskiBroj);
        if(validation.hasErrors()) {
            for(Error error : validation.errors()) {
                System.out.println(error.message());
            }
            validation.keep();
            show("add");
        }else {
            MESTO mesto=new MESTO();
            mesto.NAZIV=nazivMesta;
            mesto.POSTANSKI_BROJ=postanskiBroj;
            mesto.save();
            validation.keep();
            show("add");
        }
    }
    public static void filter(@Required String nazivMesta){
        List<MESTO> mesta = MESTO.find("byNAZIVLike", "%"+ nazivMesta +"%").fetch();
        String mode = "edit";
        renderTemplate("Mesta/show.html", mesta, mode);
    }
    public static void edit(@Required String nazivMesta, int postanskiBroj, long id){
        MESTO mesto = MESTO.findById(id);
        mesto.NAZIV=nazivMesta;
        mesto.POSTANSKI_BROJ = postanskiBroj;
        mesto.save();
        show("");
    }
    public static void delete(long id){
        MESTO mesto = MESTO.findById(id);
        System.out.println(id);
        mesto.delete();
        show("");
    }
}
