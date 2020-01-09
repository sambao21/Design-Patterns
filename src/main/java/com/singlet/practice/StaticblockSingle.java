package com.singlet.practice;

public class StaticblockSingle {
    private static StaticblockSingle instance;


    /// same as early inialization, but objects is instaniated in static block
    private StaticblockSingle(){

    }

    static{
        try{
            instance = new StaticblockSingle();
        }catch(Exception e){
            throw new RuntimeException("Exception");
        }
    }

    public StaticblockSingle getInstance(){
        return instance;
    }
}
