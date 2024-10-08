package com.nanos.creational.singletonDP;

public class LazySingleton {

    private  static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public String getData(){
        return "LazySingleton data";
    }

}
