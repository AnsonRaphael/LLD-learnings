package com.nanos.interface_segmentation;

public class WaiterImpl implements Waiter {

    String name ;

    public WaiterImpl(String name){
        this.name= name;
    }

    @Override
    public void serveCustomer() {
        System.out.println("serving food");
    }

    @Override
    public String getName() {
        return name;
    }
}
