package com.arunabha.singleton;

// sometimes it may be required that we need only one instance of a class to be created
// that's where singleton class comes in the picture
// only one object is allowed
// it's a class which you can create one object of

public class Singleton {
    private int num = 10;
    private Singleton(){}

    // you always give this
    // since the 'instance' is not going to depend on the object of the class
    // we make it 'static'
    private static Singleton instance;

    // a func that will give you an instance
    // cuz you cannot use constructor outside the class as it's private
    public static Singleton getInstance(){
        // check whether 1 object only created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

