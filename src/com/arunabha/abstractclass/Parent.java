package com.arunabha.abstractclass;

// you cannot have a final abstract class
// it does not support multiple inheritance, done via interface
public abstract class Parent {
    int age;
    final int ID;

    // tho we cannot use it explicitly
    public Parent(int age){
        this.age = age;
        ID = -1; // this is called via child classes
    }
    abstract void career(String name);
    abstract void partner(String name, int age);

    // static methods can be created in abstract class
    // it cannot be overridden
    static void hello(){
        System.out.println("Hello, Mate!!");
    }

    void normal(){
        System.out.println("Normal method is called!");
    }

    // you cannot create abstract static method in this cuz they are illegal combination
    // static methods are part of the class itself and abstract methods are overridden
}
