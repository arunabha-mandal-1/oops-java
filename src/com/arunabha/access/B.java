package com.arunabha.access;

// subclass in the same package as A
// B indirectly extends Object class
public class B extends A {
    public B(String name, boolean flag, char ch, int num) {
        super(name, flag, ch, num);
    }

    public static void main(String[] args) {
        B b = new B("Alex", false, 'l', 15);


        // call via subclass
        System.out.println(b.name); // public
        System.out.println(b.flag); // protected
        System.out.println(b.ch); // default
//        System.out.println(b.num); // private : not accessible

    }
}
