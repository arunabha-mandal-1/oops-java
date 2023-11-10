package com.arunabha.comparable;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    // u can implement this according to ur needs
    @Override
    public int compareTo(Student other) {
        System.out.println("In compareTo() method!");
        int diff = this.rollNo - other.rollNo;

        // if diff is less than 0, the object is less than other
        // if diff is equal to 0, the object is equal to other
        // if diff is greater than 1, the object is greater than other

        return diff;
    }


}
