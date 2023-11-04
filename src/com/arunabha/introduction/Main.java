package com.arunabha.introduction;

public class Main {
    public static void main(String[] args) {

        // declaring an object student1, happens at compile time
        // in stack
        Student student1;

//        System.out.println(student1); // error now

        // dynamically allocated at runtime and returns a ref of it
        // in heap, 'new' is used in dynamic memory allocation
        student1 = new Student();
//        System.out.println(student1);

        // printing default value set by java
//        System.out.println(student1.name);
//        System.out.println(student1.rno);
//        System.out.println(student1.marks);

        // modifying
        student1.rno = 12;
        student1.name = "Arunabha Mandal";
        student1.marks = 70.23f;

        // printing again
//        System.out.println(student1.name);
//        System.out.println(student1.rno);
//        System.out.println(student1.marks);

        // constructor means what happens when the object is created
        // making the properties mandatory
        // special type of function in the class
        // we have to bind the args with the object


        Student student2 = new Student(10, "Apurba Hasnda", 70.83f);
        student2.greeting();
        student2.changeName("Apurba");
        student2.greeting();

        Student student3 = new Student();
        student3.greeting();
        student3.changeName("Samrat");
        student3.greeting();

        Student random = new Student(student2);
        random.greeting();

        Student student4 = new Student(40);
        System.out.println(student4.name + ", " + student4.rno + ", " + student4.marks);

        // two reference variable pointing to the same object
        // we can change the object by any of these two
        Student one = new Student(80);
        Student two = one;
        one.name = "Alex";
        System.out.println(two.rno + ", " + two.name);
    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties abject by object
    // we need one word to access every object, that's where 'this' keyword comes in
    // Constructor, return type is the class itself
    Student() {
        this.rno = -99;
        this.name = "_student_";
        this.marks = -99.99f;
    }

    // One way of doing this but the agrs name must be different from properties name
    // otherwise everything will be set to default properties values
//    Student(int rollno, String stdname, float stdmarks){
//        rno = rollno;
//        name = stdname;
//        marks = stdmarks;
//    }

    // another way is using 'this' keyword, recommended way
    // Student sam = Student(01, "Sam", 99.99);
    // here 'this' will be replaced with 'sam'
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // another constructor that takes value from another object
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // calling constructor from another constructor
    Student(int rno){

        // internally works like: new Student(rno, "_student_", -99.99f)
        this(rno, "_student_", -99.99f);
    }

    void greeting() {
        System.out.println("Hello, my name is " + name + "!!");
    }

    // again to demonstrate 'this' keyword
    // it's always safe flag to use 'this' keyword

    // won't work
//    void changeName(String name) {
//        name = name;
//    }

    // but it will work
    void changeName(String name){
        this.name = name;
    }
}

// why no 'new' keyword while creating primitive data types?
// in JAVA, primitive dts are not implemented as objects
// to increase efficiency
