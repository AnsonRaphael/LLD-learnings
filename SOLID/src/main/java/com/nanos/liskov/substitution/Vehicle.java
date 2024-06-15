package com.nanos.liskov.substitution;

public class Vehicle {
    public int getWheel(){
        return 2;
    }

    // removed specific function and kept only generic function in parent class
//    public boolean hasEngine(){
//        return true;
//    }
}
