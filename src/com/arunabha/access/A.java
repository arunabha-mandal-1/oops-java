package com.arunabha.access;

public class A {

    // we can use each one of them in this class without any restrictions
    public String name; // public
    protected boolean flag; // protected
    char ch; // default
    private int num; // private
    int[] arr;

    public A(String name, boolean flag, char ch, int num){
        this.name = name;
        this.flag = flag;
        this.ch = ch;
        this.num = num;
        this.arr = new int[num];
    }
}
