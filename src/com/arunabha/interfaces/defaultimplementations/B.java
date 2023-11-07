package com.arunabha.interfaces.defaultimplementations;

public interface B {
    void greet();

    // u cannot do that if u implement A, B for the same class
    // it will cause conflict
//    default void fun(){
//        System.out.println("I am having fun with A!!");
//    }
}
