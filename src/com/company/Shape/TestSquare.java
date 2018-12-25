package com.company.Shape;

import java.util.ArrayList;

public class TestSquare {
    public static void main(String[] args) {
        Square aSquare = new Square();


        ArrayList<Shape> list = new ArrayList();

        list.add(aSquare);
        Shape aSquare2 = list.get(0);

        aSquare2.rotate();
    }
}
