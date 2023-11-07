package com.arunabha.interfaces;

// interfaces does not care about hierarchy
// two classes that are unrelated to each other can implement the same interface
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();

        Engine engine = new Car(); // this is possible, discussed previously
//        engine.brake(); // can't access, error


        Media carMedia = new Car();
//        carMedia.start();
        // to solve this problem we should create separate classes for different interfaces

        // conflict issue solved
        NiceCar niceCar = new NiceCar(); // by default, it has PowerEngine
        niceCar.start();
        niceCar.startMusic();

        // engine upgraded
        // previously in order to upgrade the engine we would've to change the entire car
        niceCar.upgradeEngine(new ElectricEngine());

        niceCar.start();

    }
}
