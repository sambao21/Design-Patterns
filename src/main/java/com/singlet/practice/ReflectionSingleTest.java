package com.singlet.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleTest {

    //breaking the singleton pattern wit the help of Reflection Utlity

    public static void main(String[] args) {
        EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton instancetwo = null;
        try{
            //change the constructor level from private to public
            Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                //breaks the singleton
                constructor.setAccessible(true);
                instancetwo = (EagerInitializationSingleton) constructor.newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instancetwo.hashCode());

    }
}
