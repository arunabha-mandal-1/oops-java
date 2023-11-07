package com.arunabha.interfaces.defaultimplementations;

// starting from java 8, it provides default implementation for java interfaces
public interface A {

    // if u add 'default' keyword, u must implement this method
    // and if it's default, u don't need to implement this method in the class u r using it in

    // the primary motivations behind the interfaces with default methods is to
    // provide a means by which interfaces can be expanded without breaking the existing code
    // for example u add another method without a body in an interface,then u have to provide the body of that method in all the classes that implements that interface
    // if u have same function in different interfaces that are being used in a class, u should not use this default stuff

    default void fun(){
        System.out.println("I am having fun with A!!");
    }

    // inherit -> override -> depends on object -> runtime polymorphism -> static methods do not depend on objects -> cannot be inherited
    // static methods in interfaces must have a body cuz they cannot be overridden
    static void eat(){
        System.out.println("Having dinner with A!!");
    }
}
