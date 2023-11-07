package com.arunabha.abstractclass;

public class Daughter extends Parent {
    int age;

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("Daughter: I am going to be a/an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Daughter: I love " + name + ". She is " + age + ".");
    }
}
