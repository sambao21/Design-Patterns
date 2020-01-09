package com.abstractFact.practice;

//First of all we need to create a Abstract Factory interface/abstract class.

public interface ComputerAbstractFactory {
    //creation of creatComputer of type Computer
    public Computer createComputer();
}

//createComputer() method is returning an instance of super class Computer.
