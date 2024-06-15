package com.nanos.liskov.substitution;

public class ByCycle extends Vehicle{

    // should not limit parent class, so only extend it, Issue here is hasEngine is not applicable for bycycle and
    // only generic function on parent class
//    @Override
//    public boolean hasEngine(){
//        return false;
//    }
}
