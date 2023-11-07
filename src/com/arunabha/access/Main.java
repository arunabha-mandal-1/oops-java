package com.arunabha.access;

// in the package
public class Main {
    public static void main(String[] args) {
        A obj = new A("Sam", true, 'a', 10);
        // need to do a faw things
        // 1. access the data members
        // 2. modify the data members

        // we cannot access private members
        // we can play with this via getter and setter
        // private members are accessible in that particular class

        System.out.println(obj.name); // public
        System.out.println(obj.flag); // protected
        System.out.println(obj.ch); // default
//        System.out.println(obj.num); // private : not accessible
    }
}
