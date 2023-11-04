package com.arunabha.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;

    // such properties/methods not directly related to object are called as static variables/methods
    // like human population in human class
    // human population is not directly related to any particular individual
    static long population;
    static void message(){
        System.out.println("Hello!!");

        // we cannot use 'this' keyword in static method
        // cuz this is part of the class not the part of the object
//        System.out.println(this.age);
    }

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;

        // for static variable instead of using 'this' use the class name
        // using class name here is a convention
        Human.population += 1;
    }

}


// summary : you cannot use non-static stuff inside static stuff unless we instantiate an object,
// but you can do the opposite without instantiating an object
