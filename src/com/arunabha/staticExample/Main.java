package com.arunabha.staticExample;

public class Main {

    // why main is declared as object
    // we can use main without creating an object
    public static void main(String[] args) {
        Human sam = new Human(20, "Sam", 10000, false);
        Human jon = new Human(22, "Jon", 20000, true);
        Human alex = new Human(23, "Alex", 25000, true);

        // Not recommended way
//        System.out.println(sam.population);
//        System.out.println(jon.population);

        // recommended way
        // don't use static variables/methods via class object
        // use it via the class itself
        // static variables do not depend on objects
        System.out.println(Human.population);

        // non-static method inside static > error
        // non-static cannot be referenced from a static context
//        greeting();

        // just for demonstration
        Main.fun(); // don't do this when fun isn't commented out in greeting(), goes to infinite loop in this context
    }

    // we know something that is non-static belongs to an object
    void greeting(){
//        fun(); // opposite is possible!
        System.out.println("Hello!!");
    }

    static void fun(){
        System.out.println("Having fun!");

        // you cannot use this cuz it requires an instance
        // but the function you are using it in does not depend on instances
//        greeting();

        // we can use it this way
        // greeting() itself has to create an object for itself
        // fun() won't do that cuz it does not need that
        Main main = new Main();
        main.greeting();
    }

    void fun2(){
        // obj -> fun2 -> greeting
        greeting(); // this is also possible tho this method will be called from static method


        // if you are using any non-static stuff inside a static stuff make sure you create an object before using it
        // if you are using any static stuff inside a non-static stuff, you don't need to create an object
        // cuz in the end an object will be created for sure to use that non-static stuff
    }
}
