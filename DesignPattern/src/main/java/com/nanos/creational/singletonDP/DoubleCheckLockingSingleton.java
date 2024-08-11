package com.nanos.creational.singletonDP;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton doubleCheckLockingSingleton;
    private DoubleCheckLockingSingleton(){

    }
    public static DoubleCheckLockingSingleton getInstance(){
        if(doubleCheckLockingSingleton == null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(doubleCheckLockingSingleton == null){
                    doubleCheckLockingSingleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return doubleCheckLockingSingleton;
    }

    public String getData(){
        return "DoubleCheckLockingSingleton data";
    }
}
