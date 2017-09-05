package controllers;

import models.Banka;
import models.Mesto;
import play.data.validation.Error;
import play.data.validation.Required;
import play.mvc.Controller;
import play.mvc.With;

import java.util.List;

/**
 * Created by Djordje on 05-Sep-17.
 */
@With(Secure.class)
public class Banke extends Controller {

    public static void show(String mode){
        List<Banka> banke=Banka.findAll();
        if (mode == null || mode.equals(""))
            mode = "edit";
        render(banke, mode);
    }
    public static void add(@Required String nazivBanke, String adresaBanke, String telefonBanke, int PIB, String swiftKod, String obracunskiRacun, int sifraBanke) {
        if(validation.hasErrors()) {
            validation.keep();
            for(Error error : validation.errors()) {
                System.out.println(error.message());
            }
            show("add");
        }else {
            Banka banka=new Banka();
            banka.sifraBanke = sifraBanke;
            banka.adresaBanke = adresaBanke;
            banka.nazivBanke = nazivBanke;
            banka.obracunskiRacun = obracunskiRacun;
            banka.PIB = PIB;
            banka.telefonBanke = telefonBanke;
            banka.swiftKod = swiftKod;
            System.out.println(banka);
            banka.save();
            validation.keep();
            show("add");
        }
    }
    public static void filter(@Required String nazivBanke){
        List<Banka> banke = Banka.find("byNAZIVBANKELike", "%"+ nazivBanke +"%").fetch();
        String mode = "edit";
        renderTemplate("Banke/show.html", banke, mode);
    }

    public static void edit(@Required String nazivBanke, String adresaBanke, String telefonBanke, int PIB, String swiftKod, String obracunskiRacun, long id, long mestoId){
        System.out.println("adresa "+adresaBanke);
        System.out.println("id "+id);

        Mesto mesto = Mesto.findById(mestoId);
        Banka banka = Banka.findById(id);
        banka.adresaBanke = adresaBanke;
        banka.nazivBanke = nazivBanke;
        banka.obracunskiRacun = obracunskiRacun;
        banka.PIB = PIB;
        banka.telefonBanke = telefonBanke;
        banka.swiftKod = swiftKod;
        banka.mesto=mesto;
        banka.save();
        show("");
    }
    public static void delete(long id){
        System.out.println("id of delete "+id);
        Banka banka = Banka.findById(id);
        banka.delete();
        show("");
    }

}
