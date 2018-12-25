package com.company.Animals;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Hippo makes intrestion noise");
    }

    @Override
    void eat() {
        System.out.println("Hippo eats grass");
    }
}
