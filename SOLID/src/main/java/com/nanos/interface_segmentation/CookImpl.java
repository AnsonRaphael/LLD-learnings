package com.nanos.interface_segmentation;

public class CookImpl implements Cook{
    String name ;

    public CookImpl(String name){
        this.name= name;
    }

    @Override
    public void cookFood() {
        System.out.println("cooking food");
    }

    @Override
    public void dishWash() {
        System.out.println("dish washer");
    }

    @Override
    public String getName() {
        return name;
    }
}
