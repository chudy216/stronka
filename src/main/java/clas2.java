import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


class class2 {
    public static void main(String[] args)  {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://pl.wikipedia.org/wiki/Specjalna:Losowa_strona").get();}
        catch (IOException e){
            e.printStackTrace();}
        Element element1 = doc.getAllElements().first();
        Elements elements1 = element1.getAllElements();

    }
}
