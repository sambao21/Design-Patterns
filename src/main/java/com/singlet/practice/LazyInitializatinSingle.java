package com.singlet.practice;

public class LazyInitializatinSingle {

    private static LazyInitializatinSingle instance;

    private LazyInitializatinSingle(){

    }

    //here the instace is first checked whether it is null and then created, and creation mehod is publi
    //however this would work fine in single thread env, but singleton might break in multithread env

    public LazyInitializatinSingle getInstance(){
        if (instance == null){
            instance = new LazyInitializatinSingle();
        }
        return instance;
    }

}
