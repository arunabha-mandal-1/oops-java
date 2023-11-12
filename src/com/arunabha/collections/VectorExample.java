package com.arunabha.collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vlist = new Vector<>();
        vlist.add(10);
        vlist.add(11);
        vlist.add(12);
        vlist.add(13);
        System.out.println(vlist);

        // vector vs arraylist
        // vector is synchronised in java but arraylist is not
        // multiple threads can access arraylist at the same time but multiple threads cannot access vector at the same time
        // if you are dealing with multi-threading stuff, arraylist is a goto option
    }
}
