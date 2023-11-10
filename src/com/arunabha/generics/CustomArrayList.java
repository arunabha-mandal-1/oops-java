package com.arunabha.generics;

import java.util.ArrayList;
import java.util.Arrays;

// in this case, we've only built this class for integer type
// to generalize this, we use generic classes
// we have to provide type safety
// we cannot add primitives in generics, we can only add classes like Integer
public class CustomArrayList {

    // can only store integers unlike internal ArrayList type
    private int[] data;
    static private int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    // add a new number
    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the curr items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    // remove element
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    // get an element
    public int get(int index){
        return data[index];
    }

    // size of the array list
    public int size(){
        return size;
    }

    // set an value at a particular index
    public void set(int index, int value){
        data[index] = value;
    }

    // to print the elements


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        // provided by java
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("s");
        System.out.println(list);
        // but we can mention type by the help of generics

        // created
        CustomArrayList ourList = new CustomArrayList();
        ourList.add(10);
        ourList.add(20);
        ourList.add(30);
        ourList.add(40);
        ourList.add(50);

        System.out.println(ourList);
        System.out.println(ourList.size());
    }
}
