package com.company.Shape;

public class Square extends Shape {
    @Override
    public void rotate() {
        super.rotate();
        System.out.println("Square - rotate");
    }

    @Override
    public void playSound() {
        super.playSound();
        System.out.println("Square - playSound");
    }
}
