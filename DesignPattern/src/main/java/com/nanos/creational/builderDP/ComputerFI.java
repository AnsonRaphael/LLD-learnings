package com.nanos.creational.builderDP;

public class ComputerFI {
    private String CPU;
    private String RAM;
    private boolean isGPUEnabled;
    private  boolean isBluetoothEnabled;

    private ComputerFI(FIBuilder fiBuilder){
        this.CPU= fiBuilder.CPU;
        this.RAM= fiBuilder.RAM;
        this.isGPUEnabled= fiBuilder.isGPUEnabled;
        this.isBluetoothEnabled= fiBuilder.isBluetoothEnabled;
    }
    public static class FIBuilder{
        private String CPU;
        private String RAM;
        private boolean isGPUEnabled;
        private  boolean isBluetoothEnabled;

        public FIBuilder ram(String ram){
            this.RAM = ram;
            return this;
        }
        public FIBuilder cpu(String cpu){
            this.CPU=cpu;
            return this;
        }
        public FIBuilder isGPUEnabled(boolean isGPUEnabled){
            this.isGPUEnabled=isGPUEnabled;
            return this;
        }
        public FIBuilder isBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this;
        }
        public ComputerFI build(){
            return new ComputerFI(this);
        }

    }

    @Override
    public String toString() {
        return "ComputerFI{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGPUEnabled=" + isGPUEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
