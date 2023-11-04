package com.arunabha.staticExample;

// this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // this is called static block
    // it contains a set of instruction that is run only once when the class is loaded into memory
    // will run only once when the first object is created
    static {
        System.out.println("I'm in static block!!");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 20

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 23


        // this time static block won't be executed
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 23
    }
}
