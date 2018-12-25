package com.company.Animals;

public class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Tiger makes a nose");
    }

    @Override
    void eat() {
        System.out.println("Tiger eats a meet");
    }
}
