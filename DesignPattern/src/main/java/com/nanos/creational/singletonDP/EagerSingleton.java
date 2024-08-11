package com.nanos.creational.singletonDP;

public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

    public String getData(){
        return "EagerSingleton data";
    }

}
