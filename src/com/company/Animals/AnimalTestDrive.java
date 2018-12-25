package com.company.Animals;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);

        System.out.println(list.extract(0));
        System.out.println(list.extract(0).hashCode());
        System.out.println(list.extract(1).hashCode());
        if (list.extract(1).equals(list.extract(1))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
