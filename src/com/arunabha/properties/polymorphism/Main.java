package com.arunabha.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();

        // what squareDup is able to access is defined by the ref variable
        // which one squareDup is able to run is defined by object
        // this is known as upcasting.

        // ref variable type is of parent class, and assigned object is of child class
        // if there is no 'area' method in Shapes, code won't work
        Shapes squareDup = new Square();
        squareDup.area(); // as this function is common

        // How java determines this?
        // java determines this with 'dynamic method dispatch'
        // this is why it's called dynamic polymorphism

        // what is dynamic method dispatch?
        // it is a mechanism by which a call to an overridden method is resolved at runtime rather than compile time
        // it's based on the type of object assigned to ref variable.
    }
}
