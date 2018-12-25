package com.company.Report;

import java.util.ArrayList;

public class TestBuzzwordsReport {
    public static void main(String[] args) {
        Report aBuzzwordReport = new BuzzwordsReport();
        Report aBuzzwordReport2 = new BuzzwordsReport();
        Report aBuzzwordReport3 = new BuzzwordsReport();
        Report concluson = new Conclusion();


        aBuzzwordReport.runReport();
        Conclusion conclusion = (Conclusion)concluson;
        conclusion.getName();

        ArrayList<Report> list = new ArrayList<>();
        list.add(aBuzzwordReport);
        list.add(aBuzzwordReport2);

        Report reportFirst = list.get(0);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(aBuzzwordReport2));


    }
}
