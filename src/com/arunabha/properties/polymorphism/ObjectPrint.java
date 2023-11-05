package com.arunabha.properties.polymorphism;

// by default, it extends Object class
public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }


    // at runtime, it will determine this
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(4444);
        System.out.println(obj);
    }
}
