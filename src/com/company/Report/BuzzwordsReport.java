package com.company.Report;

public class BuzzwordsReport extends Report implements SoundReport {
    @Override
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

//    @Override
//    void printReport() {
//        super.printReport();
//
//    }
    void buzzwordCompliance() {
        System.out.println("buzzwordCompliance");
        this.playSound();
    }

    @Override
    public void playSound() {
        System.out.println("Cola-Cola");
    }
}
