package com.company.Stack;

public class doSumething {
    public void doStuff() {
        boolean b = true;
        go(4);
        System.out.println("doStuff");
    }
    public void go(int x) {
        int z = x + 24;
        crazy();
        System.out.println("I am here");
    }

    public void crazy () {
        char c ='a';
        System.out.println("crazy");
    }

    public static void main(String[] args) {
        doSumething toDo = new doSumething();

        toDo.doStuff();
    }
}
