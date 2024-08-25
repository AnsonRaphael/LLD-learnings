package com.nanos.creational.builderDP;

public class NestedComputer {
    private String CPU;
    private String RAM;
    private boolean isGPUEnabled;
    private  boolean isBluetoothEnabled;

    @Override
    public String toString() {
        return "NestedComputer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGPUEnabled=" + isGPUEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    private NestedComputer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isGPUEnabled = builder.isGPUEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private boolean isGPUEnabled;
        private  boolean isBluetoothEnabled;

        public RamBuilder cpu(String cpu){
            this.CPU= cpu;
            return new RamBuilder(this);
        }

        public static class RamBuilder{
            private Builder builder;
            private RamBuilder(Builder builder){
                this.builder =builder;
            }
            public GPUBuilder ram(String ram){
                this.builder.RAM = ram;
                return new GPUBuilder(builder);
            }

        }
        public static class GPUBuilder{
            private Builder builder;
            private GPUBuilder(Builder builder){
                this.builder = builder;
            }
            public BleBuilder isGPU(boolean gpu){
                this.builder.isGPUEnabled = gpu;
                return new BleBuilder(builder);
            }


        }
        public static class BleBuilder {
            private Builder builder;
            private BleBuilder (Builder builder){
                this.builder = builder;
            }
            public BleBuilder isBle(boolean ble){
                this.builder.isBluetoothEnabled =ble;
                return new BleBuilder(builder);
            }
            public NestedComputer build(){
                if(builder.CPU ==null || builder.RAM==null)
                    throw new IllegalArgumentException();
                return new NestedComputer(builder);
            }
        }
    }
}
