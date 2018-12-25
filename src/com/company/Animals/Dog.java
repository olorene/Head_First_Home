package com.company.Animals;

public class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Dog makes a Gav-Gav");
    }

    @Override
    void eat() {
        System.out.println("Dog eats a meet");
    }

    public void sniff() {
        System.out.println("Hm... What is this?");
    }
}
