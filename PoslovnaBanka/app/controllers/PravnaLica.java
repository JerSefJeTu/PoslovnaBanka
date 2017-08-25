package controllers;

import models.PravnoLice;
import play.data.validation.Required;
import play.mvc.Controller;

import java.util.List;

/**
 * Created by Djordje on 8/25/2017.
 */
public class PravnaLica extends Controller {

    public static void show(String mode){
        List<PravnoLice> pravnaLica=PravnoLice.findAll();
        if (mode == null || mode.equals(""))
            mode = "edit";
        render(pravnaLica, mode);
    }
    /*public static void add(@Required String nazivMesta, int postanskiBroj) {
        System.out.println(nazivMesta+" "+postanskiBroj);
        if(validation.hasErrors()) {
            for(Error error : validation.errors()) {
                System.out.println(error.message());
            }
            validation.keep();
            show("add");
        }else {
            Mesto mesto=new Mesto();
            mesto.naziv=nazivMesta;
            mesto.postanskiBroj=postanskiBroj;
            mesto.save();
            validation.keep();
            show("add");
        }
    }*/

    public static void filter(@Required String username){
        List<PravnoLice> pravnalica = PravnoLice.find("byUSERNAMELike", "%"+ username +"%").fetch();
        String mode = "edit";
        renderTemplate("PravnaLica/show.html", pravnalica, mode);
    }

    public static void edit(){
   /*     Mesto mesto = Mesto.findById(id);
        mesto.naziv=nazivMesta;
        mesto.postanskiBroj = postanskiBroj;
        mesto.save();*/
        show("");
    }
    public static void delete(long id){
        PravnoLice pravnoLice  = PravnoLice.findById(id);
        System.out.println(id);
        pravnoLice.delete();
        show("");
    }
}
