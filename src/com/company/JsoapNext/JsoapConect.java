package com.company.JsoapNext;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class JsoapConect {
    public void myConnect() throws IOException{

        Document doc = Jsoup.connect("http://tortuga-gamestable.top/admin").get();
        String title = doc.html();

        System.out.println(title);

    }
}
