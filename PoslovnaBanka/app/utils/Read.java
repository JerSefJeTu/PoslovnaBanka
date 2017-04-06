package utils;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import play.Play;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

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

    private static boolean finishPayment(Document document, String root) {
        if(root.equals("mt103")) {

            return true;
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
