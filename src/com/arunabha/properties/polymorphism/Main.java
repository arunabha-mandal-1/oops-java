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
        // which one squareDup is able to access is defined by object
        Shapes squareDup = new Square();
        squareDup.area(); // as this function is common
    }
}
