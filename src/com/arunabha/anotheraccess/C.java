package com.arunabha.anotheraccess;

import com.arunabha.access.A;

// subclass in different package
public class C extends A {
    public C(String name, boolean flag, char ch, int num) {
        super(name, flag, ch, num);
    }

    public static void main(String[] args) {
        C c = new C("Kittu", false, 'k', 45);

        // if we call via base class here, it won't work as expected
        // call via subclass **imp**
        System.out.println(c.name); // public
        System.out.println(c.flag); // protected
//        System.out.println(c.ch); // default : not accessible
//        System.out.println(c.num); // private : not accessible
    }
}

// subclass of C also can access protected members
