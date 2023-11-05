package com.arunabha.properties.polymorphism;

// compile time polymorphism via method overloading(different data types, oder of data types, return types)
public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(5, 2, 3));

        // object creation happens at run time but which method to call, type checking are decided at compile time
        // that's why it's called compile time polymorphism

//        System.out.println(obj.sum(1, 2, 3, 5)); // error
    }
}
