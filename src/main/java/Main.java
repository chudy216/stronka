import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://pl.wikipedia.org/wiki/Specjalna:Losowa_strona").get();
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter("d://stronkikodhtmlowy.doc"));
            writer.write(doc.toString());

        }
        catch ( IOException e)
        { }
    }
}
