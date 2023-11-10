package com.arunabha.generics;

import java.util.Arrays;

// generics type checking happens at compile time
// object creation happens at runtime
// <T extends String> to restrict generic type: so that we can use String class or subclasses of String

public class CustomGenericArrayList<T> {
    private Object[] data; // cuz at the time of compilation, type won't be decided
    private static int DEFAULT_SIZE = 5;
    private int size = 0; // also working as index value

    public CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    // add object
    public void add(T obj){
        if(isFull()){
            resize();
        }
        data[size++] = obj;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }


    // remove an object
    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    // get an element : we can do any of these
    public Object get(int index){
        return data[index];
    }

//    public T get(int index){
//        return (T)data[index];
//    }

    // size of the list
    public int size(){
        return size;
    }

    // set a value
    public void set(int index, T value){
        data[index] = value;
    }

    // string rep
    @Override
    public String toString(){
        return "CusGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();
        list.add("Arunabha");
        list.add("Kittu");
        list.add("Babai");
        System.out.println(list.toString());

        System.out.println(list.get(0));
    }
}
