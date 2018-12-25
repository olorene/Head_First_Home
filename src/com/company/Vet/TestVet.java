package com.company.Vet;

import java.util.ArrayList;

public class TestVet {
    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner();
        petOwner.start();

        ArrayList<PetOwner> petOwnerList = new ArrayList<>();

        petOwnerList.add(petOwner);

        Boolean size = petOwnerList.isEmpty();
        System.out.println(size);

        boolean contains = petOwnerList.contains(petOwner);
        System.out.println(contains);

        int someValue = petOwner.getSomeValue();
        System.out.println(someValue);

        int value = 13;
        PetOwner ownerNew = new PetOwner(value);

        int someValue1 = ownerNew.getSomeValue();
        System.out.println(someValue1);

    }
}
