package com.factoPattern.practice;

//Factory Class
//We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
//getComputer is the factory method
//deciding class which class to be instantiated


public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
