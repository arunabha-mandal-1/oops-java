package com.arunabha.interfaces.extenddemo;

// we are implementing B, so we would've to override both the methods
// interface to class = 'implements'
// interface to interface = 'extends'
// class to class = 'extends'
public class Main implements B{
    @Override
    public void fun() {
        System.out.println("Having super fun!");
    }

    @Override
    public void greet() {
        System.out.println("Hellloooo!!");
    }
}
