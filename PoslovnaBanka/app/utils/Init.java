package utils;

import models.*;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Init extends Job {

    public void doJob() {
        if(Mesto.count() == 0) {
            //sa fixtures,delete() se brise kes koji kontorlise
            //kojie je id da dobije entitet
            Fixtures.delete();
            Fixtures.loadModels("initial-data.yml");
//            Mesto mesto1 = new Mesto(111111, "MESTO1");
//            Mesto mesto2 = new Mesto(2222, "MESTO2");
//            FizickoLice fizickoLice = new FizickoLice("adresa1", "email1", "12345", "12",
//                    "stek111", "123", "stefan", "kajkut", "1200291", mesto1);
//            Delatnost delatnost = new Delatnost("sifra1", "NazivDelatnosti");
//            PravnoLice pravnoLice = new PravnoLice("adresa2", "email2", "12345", "123", "abc", "def",
//                    "naziv1", "2122222", "1231333311", delatnost, mesto2);
//            PravnoLice pravnoLice1 = new PravnoLice("adresa3", "email222", "1231", "121", "klara", "abc", "naaaaa",
//                    "brojbroj", "pibpib", delatnost, mesto1);
//            mesto1.save();
//            mesto2.save();
//            delatnost.save();
//            fizickoLice.save();
//            pravnoLice.save();
//            pravnoLice1.save();
//
//            Klijent klijent = Klijent.findById(2L);
//
//            System.out.println("INSTANCA =" + klijent.toString());
//            if(klijent instanceof PravnoLice) {
//                System.out.println("PRAVNO LICE");
//                System.out.println(((PravnoLice) klijent).delatnost.naziv);
//            } else if (klijent instanceof FizickoLice){
//                System.out.println("FIZICKO LICE");
//            }
        }
    }
}