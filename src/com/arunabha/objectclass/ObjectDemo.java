package com.arunabha.objectclass;

public class ObjectDemo {
    int num;
    float gpa;

    // this is optional
    public ObjectDemo() {
        super();
    }

    // this is not option
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // hashmap stuffs, number representation of our object
    // unique representation of an object via number
    // random int value formed via using algorithm
    // we can modify using our own implementation
    @Override
    public int hashCode() {
        return super.hashCode();
//        return this.num;
    }

    // returns if the two objects are equal
    // we can write own algo by overriding
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num
                && this.gpa == ((ObjectDemo)obj).gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // already covered : to do some pretty printing stuffs of string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // already covered : executes when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
