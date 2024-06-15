package com.nanos.liskov.substitution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> ls = new ArrayList<>();
        ls.add(new ByCycle());
        ls.add(new Vehicle());
        ls.add(new EngineVehicle());
        ls.add(new Car());
        ls.add(new MotorCycle());
        for(Vehicle v : ls){
            System.out.println(v.getWheel());
        }
    }
}
