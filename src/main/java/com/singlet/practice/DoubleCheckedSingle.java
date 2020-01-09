package com.singlet.practice;

public class DoubleCheckedSingle {
    private static DoubleCheckedSingle instance;

    private DoubleCheckedSingle() throws Exception {
    if(instance != null){
        throw new Exception("Already created");
    }
    }

    public static DoubleCheckedSingle getInstance() throws Exception {
        if (instance == null) {
            synchronized (DoubleCheckedSingle.class) {
                instance = new DoubleCheckedSingle();
            }
        }
        return instance;
    }
}
