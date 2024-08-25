package com.nanos.creational.builderDP;

public class ComputerH {
    private String CPU;
    private String RAM;

    protected ComputerH(ComputerHBuilder<?> builder){
        this.CPU = builder.CPU;
    }

    public static class ComputerHBuilder<T extends ComputerHBuilder<T>>{
        private String CPU;
        private String RAM;

        public T cpu(String cpu){
            this.CPU = cpu;
            return self();
        }

        public T ram(String ram){
            this.RAM = ram;
            return self();
        }

        protected T self( ){
            return (T)this;
        }
        public ComputerH build(){
           return new ComputerH(this);
        }
    }

    @Override
    public String toString() {
        return "ComputerH{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                '}';
    }
}
