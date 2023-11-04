package com.arunabha.staticExample;

class TestClass3{
    static String name;
    TestClass3(String name){
        TestClass3.name = name;
    }
}

public class InnerClasses {

    // Inner classes can be static
    // cuz it is dependent on outside class
    static class TestClass1{
        String name;
        TestClass1(String name){
            this.name = name;
        }
    }

    class TestClass2{
        String name;
        TestClass2(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // it's ok
        // cuz the corresponding inner class is static,
        // so we can access this from static 'main' function
        TestClass1 a = new TestClass1("Arunabha");

        // it's not ok
        // cuz the corresponding inner class is not static,
        // so we cannot use this from 'main' function without creating an instance of InnerClasses
        // TestClass2 needs an instance of InnerClasses
//        TestClass2 b = new TestClass2("Kittu");


        // behaviour of 'static' actually depends on in which context we are using it
        // lets see some example

        TestClass3 c = new TestClass3("Samrat");
        TestClass3 d = new TestClass3("Babai");

        // Both gives same output
        // here instance variable is static,
        // so no matter how many objects we create with TestClass3,
        // the value of instance variable will be same cuz it's object independent
        System.out.println(c.name);
        System.out.println(d.name);

        TestClass1 e = new TestClass1("Alex");
        TestClass1 f = new TestClass1("Jonny");

        // different output
        // in this case the class itself is static wrt the outer class
        // here TestClass1 depends on outer class itself(not on the instances)
        // 'main' and TestClass1 can depend on each other
        System.out.println(e.name);
        System.out.println(f.name);
    }
}

// Outside classes cannot be static
// cuz it is not itself dependent on any other class

// objects are created during runtime
// and static stuffs do not depend on objects
// they are resolved during compile time
