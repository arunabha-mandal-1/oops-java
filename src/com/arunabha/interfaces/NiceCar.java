package com.arunabha.interfaces;

public class NiceCar {
    private Engine engine;

    // 'final' cuz we won't change the media player
    private final Media player = new CDPlayer();

    public NiceCar(){
        this.engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        // if car runs on electric, it will call ElectricEngine
        // if car runs on petrol/diesel, it will call PowerEngine
        engine.start();
    }

    public void stop(){
        engine.start();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    // we can go from ElectricEngine to PowerEngine
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
