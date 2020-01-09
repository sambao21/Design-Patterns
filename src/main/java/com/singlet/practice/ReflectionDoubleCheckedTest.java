package com.singlet.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDoubleCheckedTest {
    public static void main(String[] args) throws Exception {
        DoubleCheckedSingle instanceOne = DoubleCheckedSingle.getInstance();
        DoubleCheckedSingle instanceTwo = null;
        try{
            //change the constructor level from private to public
            Constructor[] constructors = DoubleCheckedSingle.class.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                //breaks the singleton
                constructor.setAccessible(true);
                instanceTwo = (DoubleCheckedSingle) constructor.newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
