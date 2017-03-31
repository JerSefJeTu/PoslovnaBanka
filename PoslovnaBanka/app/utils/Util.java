package utils;

import models.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by stefan on 3/30/17.
 */
public class Util {

    private static Document document = null;
    private static String path = "uplate/";

    public static void createMT103XML(MT10X mt103) {

        Klijent klijentDuznik = null;

        Klijent klijentPoverilac = null;

        Element banka = null;
        Element klijent = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory
                .newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        //<mt103>
        Element root = document.createElement("mt103");
        root.setAttributeNode(document.createAttribute("idPoruke"));
        root.setAttribute("idPoruke", String.valueOf(mt103.id));
        root.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance",
                "xsi:schemaLocation",
                "https://github.com/JerSefJeTu/PoslovnaBanka/mt103 ../data/mt103.xsd");

        Element duznik = document.createElement("duznik");
        banka = createBank(mt103.swiftKod1, mt103.obracunskiRacun1);
        klijent = createClient(klijentDuznik);
        duznik.appendChild(banka);
        duznik.appendChild(klijent);

        Element poverilac = document.createElement("poverilac");
        banka = createBank(mt103.swiftKod2, mt103.obracunskiRacun2);
        klijent = createClient(klijentPoverilac);
        poverilac.appendChild(banka);
        poverilac.appendChild(klijent);

        // Ako je mt103, onda postoji samo jedan nalog
        // stoga sam taj nalog i uzeo.
        Nalog nalogRef = mt103.nalog.get(0);

        Element nalog = createAccount(nalogRef);

        Element uplata = document.createElement("uplata");
        Element zaduzenje = createPayment("zaduzenje",
                nalogRef.racunduznika,
                String.valueOf(nalogRef.modelZaduzenja),
                nalogRef.pozivNaBrojZaduzenja);
        Element odobrenje = createPayment("odobrenje",
                nalogRef.racunPoverioca,
                String.valueOf(nalogRef.modelOdobrenja),
                nalogRef.pozivNaBrojOdobrenja);
        uplata.appendChild(zaduzenje);
        uplata.appendChild(odobrenje);

        root.appendChild(duznik);
        root.appendChild(poverilac);
        root.appendChild(nalog);
        root.appendChild(uplata);

        writeToFile(root, mt103.id);
    }

    private static void writeToFile(Element root, long id) {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(root);
            StreamResult result = new StreamResult(new File(path + id + ".xml"));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e1) {
            e1.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    private static Element createPayment(
            String nazivElementa,
            String racun,
            String model,
            String poziv) {

        Element ZO = document.createElement(nazivElementa);

        Element brojRacuna = document
                .createElement("broj_racuna");
        Text brojRacunaText = document.
                createTextNode(racun);
        brojRacuna.appendChild(brojRacunaText);

        Element brojModela = document
                .createElement("broj_modela");
        Text brojModelaText = document
                .createTextNode(model);
        brojModela.appendChild(brojModelaText);

        Element pozivNaBroj = document
                .createElement("poziv_na_broj");
        Text pozivNaBrojText = document
                .createTextNode(poziv);
        pozivNaBroj.appendChild(pozivNaBrojText);

        ZO.appendChild(brojRacuna);
        ZO.appendChild(brojModela);
        ZO.appendChild(pozivNaBroj);

        return ZO;
    }

    private static Element createAccount(Nalog account) {
        Element nalog = document.createElement("nalog");

        Element svrhaPlacanja = document.createElement("svrha_placanja");
        Text svrhaPlacanjaText = document.createTextNode(account.svrhaPlacanja);
        svrhaPlacanja.appendChild(svrhaPlacanjaText);

        Element valuta = createCurrency(account);

        Element datum = document.createElement("datum");
        Text datumText = document.createTextNode(String.valueOf(account.datumNaloga));
        datum.appendChild(datumText);

        nalog.appendChild(svrhaPlacanja);
        nalog.appendChild(valuta);
        nalog.appendChild(datum);

        return nalog;
    }

    private static Element createCurrency(Nalog nalog) {
        Element valuta = document.createElement("valuta");

        Element datum = document.createElement("datum");
        Text datumText = document.createTextNode(
                String.valueOf(nalog.datumNaloga));
        datum.appendChild(datumText);

        Element sifra = document.createElement("sifra");
        Text sifraText = document.createTextNode("RSD");
        sifra.appendChild(sifraText);

        valuta.appendChild(datum);
        valuta.appendChild(sifra);

        return valuta;
    }

    private static Element createBank(String swiftKod,
                                      String obracunskiRacun) {

        Element banka = document.createElement("banka");

        Element swift = document.createElement("swift");
        Text swiftText = document.createTextNode(swiftKod);
        swift.appendChild(swiftText);

        Element brojRacuna = document.createElement("broj_racuna");
        Text brojRacunaText = document.createTextNode(obracunskiRacun);
        brojRacuna.appendChild(brojRacunaText);

        banka.appendChild(swift);
        banka.appendChild(brojRacuna);

        return banka;
    }

    private static Element createClient(Klijent client) {

        Element klijent = null;

        if(client instanceof Fizicko) {
            klijent = createIndividual((Fizicko) client);
        } else if (client instanceof Pravno) {
            klijent = createLegalEntity((Pravno) client);
        } else {
            System.out.print("Greska!");
        }

        return klijent;

    }

    private static Element createLegalEntity(Pravno legalEntity) {
        Element klijent = document.createElement("klijent");

        klijent.setAttributeNode(document.createAttribute("tip"));
        klijent.setAttribute("tip", "pravno_lice");

        Element naziv = document.createElement("naziv");
        Text nazivText = document.createTextNode(legalEntity.naziv);
        naziv.appendChild(nazivText);

        Element adresa = createAddress(legalEntity.adresa,
                legalEntity.mesto);

        klijent.appendChild(naziv);
        klijent.appendChild(adresa);

        return klijent;
    }

    private static Element createIndividual(Fizicko individual) {
        Element klijent = document.createElement("klijent");

        klijent.setAttributeNode(document.createAttribute("tip"));
        klijent.setAttribute("tip", "fizicko_lice");

        Element ime = document.createElement("ime");
        Text imeText = document.createTextNode(individual.ime);
        ime.appendChild(imeText);

        Element prezime = document.createElement("prezime");
        Text prezimeText = document.createTextNode(individual.prezime);
        prezime.appendChild(prezimeText);

        Element adresa = createAddress(individual.adresa,
                individual.mesto);

        klijent.appendChild(ime);
        klijent.appendChild(prezime);
        klijent.appendChild(adresa);

        return klijent;
    }

    private static Element createAddress(String address, Mesto location) {
        Element adresa = document.createElement("adresa");

        Element ulica = document.createElement("ulica");
        Text ulicaText = document.createTextNode(address);
        ulica.appendChild(ulicaText);

        Element mesto = document.createElement("mesto");
        mesto.setAttributeNode(document.createAttribute("pb"));
        mesto.setAttribute("pb", String.valueOf(location.postanskiBroj));
        Text mestoText = document.createTextNode(location.naziv);
        mesto.appendChild(mestoText);

        adresa.appendChild(ulica);
        adresa.appendChild(mesto);

        return adresa;
    }

}
