package com.arunabha.singleton;

public class Main {
    public static void main(String[] args) {

        // it cannot be done cuz constructor is private
        // if the constructor is public lot of objects will be created
        // and that won't serve the purpose of static class
//        Singleton s = new Singleton();

        // al three pointing to same object
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // Returns same output
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
