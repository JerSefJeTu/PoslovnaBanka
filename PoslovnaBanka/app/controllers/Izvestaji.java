package controllers;

import models.Banka;
import models.DnevnoStanjeRacuna;
import models.FizickoLice;
import models.Klijent;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import play.data.validation.Required;
import play.mvc.Controller;
import java.sql.DriverManager;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Created by Djordje on 4/7/2017.
 */
public class Izvestaji extends Controller {

    public static void show()
    {
        render();
    }

    public static void report1(Date datumPocetka, Date datumZavrsetka, long idKlijenta){
        try {
            Klijent klijent = Klijent.findById(idKlijenta);
            String username = klijent.username;
            Map params = new HashMap(1);

            params.put("datumPocetka", datumPocetka);
            params.put("datumZavrsetka", datumZavrsetka);
            params.put("username", username);
            if(klijent instanceof FizickoLice){
                System.out.println("fizicko");
                JasperPrint jp = JasperFillManager.fillReport( "D://Poslovna Informatika Banka/PoslovnaBanka/PoslovnaBanka/izvestaji/report1Fizicko.jasper",params,DriverManager.getConnection("jdbc:mysql://localhost:3306/poslovna2", "root", "1234") );
                JasperViewer.viewReport(jp, false);
            }else{
                System.out.println("pravno");
                JasperPrint jp = JasperFillManager.fillReport( "D://Poslovna Informatika Banka/PoslovnaBanka/PoslovnaBanka/izvestaji/report1Pravno.jasper",params,DriverManager.getConnection("jdbc:mysql://localhost:3306/poslovna2", "root", "1234") );
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        show();
    }

    public static void report2(String swiftKod){
        try {
            Map params = new HashMap(1);
            params.put("swiftKod", swiftKod);
            JasperPrint jp = JasperFillManager.fillReport( "D://Poslovna Informatika Banka/PoslovnaBanka/PoslovnaBanka/izvestaji/report2.jasper",params,DriverManager.getConnection("jdbc:mysql://localhost:3306/poslovna2", "root", "1234") );
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        show();
    }
}
