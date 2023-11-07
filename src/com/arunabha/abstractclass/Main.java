package com.arunabha.abstractclass;

public class Main {
    public static void main(String[] args) {

        // abstract class objects cannot be created
//        Parent mom = new Parent(45); // error

        Parent.hello(); // cuz it's abstract

        Son son = new Son(22);
        son.career("Programmer");
        son.normal();

        Daughter daughter = new Daughter(21);
        daughter.career("Doctor");
        son.normal();

        Parent a = new Daughter(23); // legal
        Parent b = new Son(23); // legal
    }
}
