package com.arunabha.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 15, 23);
        Box box2 = new Box(box1);

//        box2.information();


//        BoxWeight box3 = new BoxWeight(10, 25, 12, 3);

        // child can use properties of a parent class,
//        System.out.println(box3.l);

        Box box4 = new Box(1, 1, 1);

        // but parent cannot access the properties of child
//        System.out.println(box4.weight); // error

        BoxWeight box5 = new BoxWeight();
//        System.out.println(box5.l + " " + box5.weight);

        Box box6 = new BoxWeight();

        // but parent cannot access the properties of child
        // it's actually the type of the ref variable and not the object
        // that determines what members can be accessed
        // when a ref to a subclass obj is assigned to a superclass ref variable,
        // you will only have access to those parts of the objects that are defined in the superclass
//        System.out.println(box6.weight); // cannot resolve > error

        // and we cannot do this
//        BoxWeight box7 = box6;

//        System.out.println(box6.w); // this is ok

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the object itself is of type parent class, there is no way we can call the constructor of the child class
        // parent class has no idea about 'weight'
        // that's why it's an error
        // so, you cannot have a chile ref variable and a parent class constructor
//        BoxWeight box7 = new Box(12, 10, 23);

//        BoxWeight box8 = new BoxWeight();
//        box8.printWeight(); // to demonstrate another use case of superclass besides calling constructor

        BoxPrice box9 = new BoxPrice(); // debug it to understand
        BoxPrice box10 = new BoxPrice(10, 52, 1200); // debug it to understand

        Box box11 = new BoxWeight();
        // static stuffs do not depend on class object rather depend on class
        // static methods can be inherited but cannot be overridden
        box11.greeting(); // called from parent class(class in ref variable)

        // overriding depends on object
        // static does not depend on object
        // static methods cannot be overridden

        // static methods can be inherited, like
        BoxWeight box12 = new BoxWeight();
        box12.goodbye(); // although recommended way is to use class itse;f to refer
        box12.printWeight();
    }
}
