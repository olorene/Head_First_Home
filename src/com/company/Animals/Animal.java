package com.company.Animals;

public class Animal {
    String picture;
    String food;
    Integer hunger;
    String boundaries;
    String location;

    public void makeNoise(){
        System.out.println("Animal make noise");
    }
    void eat() {
        System.out.println("Animal eats some food");
    }
    void sleep() {
        System.out.println("Animal sleeps from 10pm to 6am");
    }
    void roam() {
        System.out.println("Animal roams");
    }

}
