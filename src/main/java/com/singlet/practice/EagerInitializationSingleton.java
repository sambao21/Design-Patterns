package com.singlet.practice;

public class EagerInitializationSingleton {


    // ei class er object etei banachi ami

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

}
