package com.arunabha.abstractclass;

public class Son extends Parent{
    int age;

    public Son(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("Son: I am going to be a/an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Son: I love " + name + ". He is " + age + ".");
    }

}
