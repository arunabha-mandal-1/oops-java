package com.arunabha.properties.inheritance;

// every class in java inherits the Object class
// if we call super() from Box's constructor, it will call the constructor of the Object class
// super() points to the directly above one class

public class Box {
    double l;
    double h;
    double w;
    double weight = -100;

    Box() {
//        super(); // Object class
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    // three args passed
    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    static void greeting(){
        System.out.println("I am from Box class. Greetings!");
    }

    static void goodbye(){
        System.out.println("Bye from Box!!");
    }

    public void information() {
        System.out.println("Running the Box!!");
        System.out.println("Length: " + this.l);
        System.out.println("Height: " + this.h);
        System.out.println("Width: " + this.w);
    }
}

// any 'private' stuff is accessible in that particular class
// tho subclass has access to the members of its parent class,
// it doesn't have access to the private members of the parent class

// you can set private members via child class's constructor, and it will work
// cuz it's nothing to do with the child class
// it's actually using parent class constructor