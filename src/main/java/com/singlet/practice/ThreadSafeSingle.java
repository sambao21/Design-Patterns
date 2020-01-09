package com.singlet.practice;

public class ThreadSafeSingle {
    private static ThreadSafeSingle instance;

    private ThreadSafeSingle(){

    }

    //add synchronized in the global access method to make it thread safe, performance comes down
    //to increase the performance we use double-checked locking mechanism

    public static synchronized ThreadSafeSingle getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingle();
        }
        return instance;
    }
}
