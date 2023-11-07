package com.arunabha.interfaces;

public interface Brake {
    void brake();
    void start(); // does not matter, conflicts resolved but there is a catch
                  // car gotta be confused whether it should use start of Brake functionality or Engine or Media player
}
