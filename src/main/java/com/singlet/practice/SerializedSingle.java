package com.singlet.practice;

import java.io.Serializable;

public class SerializedSingle implements Serializable {
    private static SerializedSingle instance;

    private SerializedSingle(){
    }

    protected Object readResolve() {
        return getInstance();
    }

    public static SerializedSingle getInstance(){
        instance = new SerializedSingle();
        return instance;
    }

}
