package com.arunabha.interfaces.defaultimplementations;

public class Main implements A, B{
    @Override
    public void greet() {
        System.out.println("Hemlloo!!");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun(); // default implementation runs here
        A.eat(); // static method called via interface name

        // in general, overridden methods' access modifier should be same or even better i.e. less restricted
    }
}
