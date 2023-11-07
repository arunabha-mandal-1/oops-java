package com.arunabha.interfaces.nestedinterfaces;

public class A {
    // nested interface
    // nested interfaces can be public, protected, default, private.
    protected interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
