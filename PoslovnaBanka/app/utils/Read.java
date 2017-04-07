package utils;

import models.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import play.Play;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by stefan on 4/6/17.
 */
public class Read {

    private static DocumentBuilderFactory factory;
    private static Document document;
    private static DocumentBuilder documentBuilder;
    private static String neobradjeneUplatnice =
            Play.configuration.getProperty("uplatnice.neobradjene.path");
    private static String obradjeneUplatnice =
            Play.configuration.getProperty("uplatnice.obradjene.path");

    private static File neobradjenoDir;

    private static void init() {
        factory = DocumentBuilderFactory
                .newInstance();
        try {
            documentBuilder = factory
                    .newDocumentBuilder();
            document = null;
            neobradjenoDir = new File(neobradjeneUplatnice);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static void readMT102() {
        init();
        File[] neobradjenoMT102 =
                findFiles("mt102");

        readFiles(neobradjenoMT102);
    }

    public static void readMT103() {
        init();
        File[] neobradjenoMT103 =
                findFiles("mt103");

        readFiles(neobradjenoMT103);
    }

    private static boolean decomponiseMT103(Document document) {

        Element mt103El = (Element) document
                .getElementsByTagName("mt103")
                .item(0);
        Element duznikEl = (Element) mt103El
                .getElementsByTagName("duznik")
                .item(0);
        Element poverilacEl = (Element) mt103El
                .getElementsByTagName("poverilac")
                .item(0);
        Element nalogEl = (Element) mt103El
                .getElementsByTagName("nalog")
                .item(0);
        Element uplataEl = (Element) mt103El
                .getElementsByTagName("uplata")
                .item(0);

        Banka bankaDuznik = getBank(duznikEl);

        Banka bankaPoverilac = getBank(poverilacEl);

        Element duznikKlijentEl = (Element) duznikEl
                .getElementsByTagName("klijent")
                .item(0);

        Element duznikAdresaEl = (Element) duznikKlijentEl
                .getElementsByTagName("adresa")
                .item(0);

        String duznikAdresa = getAddress(duznikAdresaEl);

        String duznikString = null;
        String duznikTip = duznikKlijentEl.getAttribute("tip");
        if(duznikTip.equals("fizicko_lice")) {
            String ime = duznikKlijentEl
                    .getElementsByTagName("ime")
                    .item(0)
                    .getTextContent();
            String prezime = duznikKlijentEl
                    .getElementsByTagName("prezime")
                    .item(0)
                    .getTextContent();
            duznikString = ime + " " + prezime + duznikAdresa;
        } else if(duznikTip.equals("pravno_lice")) {
            String naziv = duznikKlijentEl
                    .getElementsByTagName("naziv")
                    .item(0)
                    .getTextContent();
            duznikString = naziv + duznikAdresa;
        }

        Element poverilacKlijentEl = (Element) poverilacEl
                .getElementsByTagName("klijent")
                .item(0);

        Element poverilacAdresaEl = (Element) poverilacKlijentEl
                .getElementsByTagName("adresa")
                .item(0);

        String poverilacAdresa = getAddress(poverilacAdresaEl);

        String poverilacString = null;
        String poverilacTip = poverilacKlijentEl.getAttribute("tip");
        if(poverilacTip.equals("fizicko_lice")) {
            String ime = poverilacKlijentEl
                    .getElementsByTagName("ime")
                    .item(0)
                    .getTextContent();
            String prezime = poverilacKlijentEl
                    .getElementsByTagName("prezime")
                    .item(0)
                    .getTextContent();
            poverilacString = ime + " " + prezime + poverilacAdresa;
        } else if(poverilacTip.equals("pravno_lice")) {
            String naziv = poverilacKlijentEl
                    .getElementsByTagName("naziv")
                    .item(0)
                    .getTextContent();
            poverilacString = naziv + poverilacAdresa;
        }

        String svrhaPlacanja = nalogEl
                .getElementsByTagName("svrha_placanja")
                .item(0)
                .getTextContent();
        Element valutaEl = (Element) nalogEl.getElementsByTagName("valuta")
                .item(0);
        String datumNalogaStr = valutaEl.getElementsByTagName("datum")
                .item(0)
                .getTextContent();
        Date datumNaloga = getDate(datumNalogaStr);

        // UPLATA
        Element zaduzenjeEl = (Element) uplataEl
                .getElementsByTagName("zaduzenje")
                .item(0);
        Element odobrenjeEl = (Element) uplataEl
                .getElementsByTagName("odobrenje")
                .item(0);
        double iznos = Double.parseDouble(uplataEl
                .getElementsByTagName("iznos")
                .item(0).getTextContent());

        //<<<ZADUZENJE>>>
        String zaduzenjeRacun = zaduzenjeEl
                .getElementsByTagName("broj_racuna")
                .item(0)
                .getTextContent();
        String zaduzenjeModel = zaduzenjeEl
                .getElementsByTagName("broj_modela")
                .item(0)
                .getTextContent();
        String zaduzenjeBroj = zaduzenjeEl
                .getElementsByTagName("poziv_na_broj")
                .item(0)
                .getTextContent();

        Racun racunDuznik = (Racun) Racun.find("byBrojRacuna", zaduzenjeRacun)
                .fetch()
                .get(0);


        //<<<ODOBRENJE>>>
        String odobrenjeRacun = odobrenjeEl
                .getElementsByTagName("broj_racuna")
                .item(0)
                .getTextContent();
        String odobrenjeModel = odobrenjeEl
                .getElementsByTagName("broj_modela")
                .item(0)
                .getTextContent();
        String odobrenjeBroj = odobrenjeEl
                .getElementsByTagName("poziv_na_broj")
                .item(0)
                .getTextContent();

        Racun racunPoverilac = (Racun) Racun.find("byBrojRacuna", odobrenjeRacun)
                .fetch()
                .get(0);

        MT10X mt103 = new MT10X();
        mt103.datum = datumNaloga;
        mt103.ukupanIznos = iznos;
        mt103.vrstaPoruke = "mt103";
        mt103.swiftKod1 = bankaDuznik.swiftKod;
        mt103.swiftKod2 = bankaPoverilac.swiftKod;
        mt103.obracunskiRacun1 = bankaDuznik.obracunskiRacun;
        mt103.obracunskiRacun2 = bankaPoverilac.obracunskiRacun;
        mt103.obradjeno = true;

        mt103.save();


        Nalog nalog = new Nalog();
        nalog.datumNaloga = datumNaloga;
        nalog.racunduznika = zaduzenjeRacun;
        nalog.racunPoverioca = odobrenjeRacun;
        nalog.pozivNaBrojOdobrenja = odobrenjeBroj;
        nalog.pozivNaBrojZaduzenja = zaduzenjeBroj;
        nalog.modelOdobrenja = odobrenjeModel;
        nalog.iznos = iznos;
        nalog.svrhaPlacanja = svrhaPlacanja;
        nalog.sacuvan = true;
        nalog.duznik = duznikString;
        nalog.primalac = poverilacString;
        nalog.mt10x = mt103;

        nalog.save();

        if(racunDuznik != null) {
            DnevnoStanjeRacuna dnevnoStanjeRacunaDuznik =
                    (DnevnoStanjeRacuna) DnevnoStanjeRacuna.find("racun_id", racunDuznik.id)
                    .fetch()
                    .get(0);


        }

        return true;
    }

    private static Banka getBank(Element client) {
        Element bankaEl = (Element) client
                .getElementsByTagName("banka")
                .item(0);
        String swift = bankaEl
                .getElementsByTagName("swift")
                .item(0)
                .getTextContent();
        Banka banka = (Banka) Banka.find("bySwiftKod", swift)
                .fetch()
                .get(0);

        return banka;
    }

    private static String getAddress(Element address) {

        String ulica = address.getElementsByTagName("ulica")
                .item(0)
                .getTextContent();

        Element mestoEl = (Element) address
                .getElementsByTagName("mesto")
                .item(0);
        String mesto = mestoEl.getTextContent();
        String postanskiBroj = mestoEl.getAttribute("pb");

        String adresa = "\n" + ulica + "\n"
                + postanskiBroj + " " + mesto;

        return adresa;
    }

    private static Date getDate(String dateStr) {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy.");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private static boolean finishPayment(Document document, String root) {
        if(root.equals("mt103")) {
            return decomponiseMT103(document);
        } else if (root.equals("mt102")) {

            return true;
        } else {
            System.out.println("Greska!");
        }
        return false;
    }

    private static void readFiles(File[] files) {
        try {
            for(File file : files) {
                document = documentBuilder.parse(file);
                if(finishPayment(document, file.getName().substring(0, 5))) {
                    file.renameTo(new File(obradjeneUplatnice + "/"
                            + file.getName()));
                    file.delete();
                }
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dispose();
    }

    private static void dispose() {
        neobradjenoDir = null;
        factory = null;
        documentBuilder = null;
    }

    private static File[] findFiles(String filePrefix) {
        File[] files = neobradjenoDir
                .listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.startsWith(filePrefix) &&
                                name.endsWith(".xml");
                    }
                });
        return files;
    }

}
