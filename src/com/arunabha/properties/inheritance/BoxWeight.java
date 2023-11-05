package com.arunabha.properties.inheritance;

public class BoxWeight extends Box{

    private final double weight;
    public double getWeight() {
        return weight;
    }

    // it will call Box's default constructor
    BoxWeight(){
        this.weight = -99;
    }

    // Want to use properties of 'Box'
    BoxWeight (double l, double h, double w, double weight){

        // in order to set l, h, w, it has to set it via parent class
        // call the parent class constructor
        // used to initialize values present in parent class
        super(l, h, w); // super() must be first statement of the child class constructor
        this.weight = weight;
    }

    // if we don't mention super() with particular number of parameters
    // it will automatically call default constructor i.e. Box()
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    // copy constructor
    BoxWeight(BoxWeight other){

        // this means 'Box old = other' and it's allowed
        // and 'old' can use first three properties from 'other'
        super(other);
        weight = other.weight;
    }

    // Static methods cannot be overridden cuz they are bounded using static binding during compile time
//    @Override
    static void greeting(){
        System.out.println("I am from BoxWeight class. Greetings!");
    }
    void printWeight(){

        // to access mentioned in this class we do
        System.out.println("From BoxWeight Class: " + this.weight);

        // another use case of super keyword
        // we can use super class variables using super keyword including the inherited ones
        // just like
        System.out.println("From Box class: " + super.weight);
    }
}
