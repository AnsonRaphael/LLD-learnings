package com.nanos.creational.builderDP;

public class Main {
    public static void main(String[] args) {
        ComputerFI computer = new ComputerFI.FIBuilder().ram("16")
                .cpu("i7")
                .isBluetoothEnabled(true)
                .isGPUEnabled(true)
                .build();
        System.out.println(computer);

        //To make Immutable Object Builder Pattern, make ComputerFI as final class

        //Hierarchical Builder Pattern
        //This variation is useful when dealing with class hierarchies, where each subclass might
        // need its own specific builder that extends the parent class's builder.
        System.out.println("------------------Hierarchical-----------");
        GamimgComputerH gmc = new GamimgComputerH.GamimngComputerHBuilder()
                .ram("12").cpu("r5").withCoolingSystem(true).build();
        System.out.println(gmc);
        //Nested builder can be used to enfore order of construction
        System.out.println("------------------Nested-----------");
        NestedComputer nesCmp = new NestedComputer.Builder().cpu("intel").ram("24").
                isGPU(true).isBle(true).build();
        System.out.println(nesCmp);
    }
}
