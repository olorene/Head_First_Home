package com.company.Animals;

public class Lion extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Lion makes a noise");
    }


    @Override
    void eat() {
        System.out.println("Lion eats meet");
    }
}
