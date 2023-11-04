package com.arunabha.introduction;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive
        int a = 10;
        int b = 15;

        System.out.println(a + ", " + b);
        swap(a, b);
        System.out.println(a + ", " + b); // not swapped

        // created as an object
//        Integer b = new Integer(11); // deprecated
        Integer c = 20;
        Integer d = 30;

        System.out.println(c + ", " + d);
        swap(c, d);
        System.out.println(c + ", " + d); // not swapped, Integer class is final


        // by convention, variable named should be in uppercase
        final int INCREASE = 2;

        // cann't change it
//        INCREASE = 10;

        // we cannot change the ref, but we can change the object
        final Student bob = new Student();
        Student pep = new Student();

        // cannot change the ref
        // when a non-primitive is final, u cannot reassign it
//        bob = pep;

        // change the object
        bob.name = "Bob";
        System.out.println("bob: " + " " + bob.name);

        pep = bob; // this is ok
        System.out.println("pep: " +" " + pep.name);

        // Garbage collection
        // you don't need to destroy the object manually, java does it by itself,
        // but you can decide what to do after the object is destroyed

        A obj;
        A obj2;
//        obj.finalize();

        // for less no of objects garbage collector won't get hit
        // cuz this ain't too much load for the memory
        for (int i=0; i<1000; i++){
            obj = new A("Random Name");
        }

        // but for larger no of objects, garbage collector will get hit
        // here this is too much load for the memory
        for (int i=0; i<10000000; i++){
            obj2 = new A("__Name__");
        }
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{

    // final variable should be initialized while declaring it
    // final guarantees immutability only when instance variables are primitive data types
    // and not the objects types and stuff
    final int num = 10;
    String name;
    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed!!");
    }
}

// in JAVA, there is nothing called pass by reference
// but when we pass objects, ref's value is passed
