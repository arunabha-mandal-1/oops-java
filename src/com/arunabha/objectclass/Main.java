package com.arunabha.objectclass;

public class Main {
    public static void main(String[] args) {
        ObjectDemo a = new ObjectDemo(34, 23.56f);
        ObjectDemo b = new ObjectDemo(34, 58.52f);
        ObjectDemo c = b;
        ObjectDemo d = new ObjectDemo(34, 23.56f);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode()); // same as b

        System.out.println(a.equals(b)); // not equal
        System.out.println(a == b); // not equal

        System.out.println(a.equals(d)); // equal, checking overridden method
        System.out.println(a == d); // not equal, checking inner implementations, addresses etc.


        // other things than equals to will be covered in comparable

        // whether an object is an instance of a class
        System.out.println(a instanceof ObjectDemo); // true
        System.out.println(a instanceof Object); // true

        // what class a particular obj belongs to
        System.out.println(a.getClass()); // final , cannot be overridden
        System.out.println(a.getClass().getName()); // final , cannot be overridden
    }
}
