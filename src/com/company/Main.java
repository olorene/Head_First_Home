package com.company;

import com.company.Animals.Dog;
import com.company.Animals.MakeCanine;
import com.company.Animals.MyAnimalList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FamilyDoctor famDoc = new FamilyDoctor();
        Surgeon surgeon = new Surgeon();
        MakeCanine makeCanine = new MakeCanine();
        Dog aDog = new Dog();
        MyAnimalList dogList = new MyAnimalList();


        for (int i = 0; i < 5; i++) {
            dogList.add(aDog);
        }
//        famDoc.treatPatient();
//        surgeon.treatPatien();
//        surgeon.makeIncision();
//        makeCanine.go();

        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        myDogArrayList.add(aDog);
        Dog d = myDogArrayList.get(0);
        System.out.println(d.hashCode());


        ArrayList<Object> myDogArrayList2 = new ArrayList<Object>();
        myDogArrayList2.add(aDog);

    }

    public void go() {
        Dog aDog = new Dog();
        Object sameDog = getObject(aDog);
    }
    public Object getObject(Object o) {
        return o;
    }
}
