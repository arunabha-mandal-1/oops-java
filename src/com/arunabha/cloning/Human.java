package com.arunabha.cloning;

// tho Cloneable interface does not have any object, we are using it,
// it's way to tell the jvm that we're cloning an object
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

    // if we don't implement Cloneable, it will throw CloneNotSupportedException

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // this is shallow copy
//        return super.clone();

        Human twin = (Human) super.clone(); // this is shallow copy

        // make a deep copy, create a new arr for twin
        twin.arr = new int[twin.arr.length]; // without this line, it will be same as shallow copy, to understand debug
        for(int i=0; i<5; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
