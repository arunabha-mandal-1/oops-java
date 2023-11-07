package com.arunabha.anotheraccess;

import com.arunabha.access.A;

// different package not subclass
public class Main {
    public static void main(String[] args) {
        A obj = new A("Arunabha", false, 'f', 20);

        // call via A class
        System.out.println(obj.name); // public
//        System.out.println(obj.flag); // protected : not accessible
//        System.out.println(obj.ch); // default : not accessible
//        System.out.println(obj.num); // private : not accessible

    }
}
