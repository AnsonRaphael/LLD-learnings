package com.nanos.liskov.substitution;

public class Car extends EngineVehicle{
    @Override
    public int getWheel(){
        return 4;
    }
}
