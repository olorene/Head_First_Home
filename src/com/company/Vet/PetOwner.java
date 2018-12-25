package com.company.Vet;


import com.company.Animals.Dog;
import com.company.Animals.Hippo;

public class PetOwner {
    private int someValue;

    PetOwner() {
        someValue = 42;
    }
    PetOwner(int value) {
        someValue = value;
    }

    public int getSomeValue() {
        return someValue;
    }

    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();

        v.giveShot(d);
        v.giveShot(h);

    }
}
