package com.arunabha.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample {

    // here we can pass list of type Number or any subclasses of Number like Float, Integer
    public static void getNumbers1(List<Number> list){
        System.out.println(Arrays.toString(list.toArray()));
    }

    // wildcard
    // now u can pass Number type or its subclasses like Integer and Float etc.
    public static void getNumbers2(List<? extends Number> list){
        System.out.println(Arrays.toString(list.toArray()));
    }

    //
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(20);

        // err : even if getNumbers take arg of type List<Number>
        // it cannot take arg of type List<Integer>, and Integer is Number's subclass
        // to solve this problem, we use wildcard
//        WildcardExample.getNumbers1(list1); // it won't work
        WildcardExample.getNumbers2(list1); // it will work


    }
}
