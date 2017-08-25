package controllers;

import models.FizickoLice;
import play.data.validation.Required;
import play.mvc.Controller;

import java.util.List;

/**
 * Created by Djordje on 8/25/2017.
 */
public class FizickaLica extends Controller {

    public static void show(String mode){
        List<FizickoLice> fizickaLica = FizickoLice.findAll();
        System.out.println(fizickaLica);
        if (mode == null || mode.equals(""))
            mode = "edit";
        render(fizickaLica, mode);
    }
    /*
    public static void add(@Required String nazivMesta, int postanskiBroj) {
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
    }
    */
    public static void filter(@Required String username){
        List<FizickoLice> fizickoLice = FizickoLice.find("byUSERNAMELike", "%"+ username +"%").fetch();
        String mode = "edit";
        renderTemplate("FizickaLica/show.html", fizickoLice, mode);
    }

    public static void edit(){
        /*Mesto mesto = Mesto.findById(id);
        mesto.naziv=nazivMesta;
        mesto.postanskiBroj = postanskiBroj;
        mesto.save();*/
        show("");
    }

    public static void delete(long id){
        FizickoLice fizickoLice = FizickoLice.findById(id);
        System.out.println(id);
        fizickoLice.delete();
        show("");
    }
}
