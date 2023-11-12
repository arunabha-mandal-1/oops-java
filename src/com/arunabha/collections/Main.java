package com.arunabha.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // |parent|               |child|
        // |interface|            |interface|
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);

        System.out.println(list1);
    }
}
