package com.arunabha.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // it's taking a lot of processing time
        // a lot of overhead with the new keyword
        Human sam = new Human(20, "Sam");
//        Human alex = new Human(sam);

        // instead we can use clone method, object cloning,
        // clone is actually a method in Object class, it can be used to copy object
        // we must implement Cloneable interface to the class whose clone we want to create
        // this is actually doing shallow copy of the object
        Human robert = (Human) sam.clone();
        System.out.println(robert.age);
        System.out.println(robert.name);

        // shallow copy demonstration:
        // in this case primitive data items are copied, and objects are pointing towards referencing object's object
        // to solve this kinda problem, we use deep copy
        System.out.println(Arrays.toString(robert.arr));
        robert.arr[0] = 123; // sam's arr also change
        robert.name = "abc"; // sam's name remains unchanged

        // even if we didn't change arr of sam tho it's arr has been changed
        System.out.println(Arrays.toString(sam.arr));
        System.out.println(sam.name); // remains unchanged


        // after deep copy
        System.out.println(Arrays.toString(robert.arr));
        System.out.println(Arrays.toString(sam.arr));
    }
}
