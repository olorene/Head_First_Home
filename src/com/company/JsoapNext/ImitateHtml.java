package com.company.JsoapNext;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class ImitateHtml {
    public void imitate() {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        String var = doc.html();

        System.out.println(var);

    }
    public void parseFragment() {
        String html = "<div><p>Lorem ipsum.</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        Element body = doc.body();

        System.out.println(body);
    }

    public void selectCss() {

    }
}
