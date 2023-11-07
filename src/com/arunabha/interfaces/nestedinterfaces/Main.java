package com.arunabha.interfaces.nestedinterfaces;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(7)); // true
        System.out.println(obj.isOdd(8)); // false
    }
}
