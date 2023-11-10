package com.arunabha.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sam = new Student(10, 89.23f);
        Student ram = new Student(12, 99.23f);

        // this is not a conventional way to do it
//        if (sam > ram) {
//            System.out.println("Sam's got more marks!");
//        } else {
//            System.out.println("Ram's got more marks!");
//        }

        // conventional way to do this is
//        if(sam.compareTo(ram) == 0){
//            System.out.println("Sam is equal to Ram!");
//        }if(sam.compareTo(ram) < 0){
//            System.out.println("Sam is less than Ram!");
//        }else {
//            System.out.println("Sam is greater than Ram!");
//        }

//        System.out.println(sam);

        // compareTo is required to sort the Student array
        Student s1 = new Student(1, 50.25f);
        Student s2 = new Student(20, 81.25f);
        Student s3 = new Student(13, 52.25f);
        Student s4 = new Student(4, 93.25f);
        Student s5 = new Student(55, 54.25f);

        Student[] studList = {s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(studList));
        Arrays.sort(studList);
        System.out.println(Arrays.toString(studList)); // sorted based on roll no we can also sort based on marks

        // sorted by marks
        // this won't depend on compareTo()
        // this one will use its own implementation
//        Arrays.sort(studList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        // same thing replaced with lambda function
        Arrays.sort(studList, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(studList));
    }
}
