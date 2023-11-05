package com.arunabha.properties.polymorphism;

public class Circle extends Shapes{

    // this will run when object of circle is created
    // hence it is overriding the parent method
    // if you want to check whether a method is overridden or not, you put this annotation
    // if we rename the function and put the @Override annotation, it will throw error
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
