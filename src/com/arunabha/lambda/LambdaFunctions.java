package com.arunabha.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        // using lambda function
//        list.forEach((item) -> System.out.println(item * 2));

        // another way of doing this
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        list.forEach(fun);
        // what is consumer??

        // implementing functional interface using lambda functions
        Operation sum = (a, b) -> (a + b);
        Operation sub = (a, b) -> (a - b);
        Operation prod = (a, b) -> (a * b);
        Operation div = (a, b) -> (int) (a / b);

        // operate has to create object for itself cuz being static main function won't do that for operate
        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(10, 5, sum));
        System.out.println(myCalculator.operate(10, 5, sub));
        System.out.println(myCalculator.operate(10, 5, prod));
        System.out.println(myCalculator.operate(10, 5, div));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);

    // if we declare more than one function here, it will throw error
}
