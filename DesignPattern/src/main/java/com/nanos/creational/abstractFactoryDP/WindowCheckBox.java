package com.nanos.creational.abstractFactoryDP;

public class WindowCheckBox implements CheckBox{
    @Override
    public void select() {
        System.out.println("Window checkbox selected");
    }
}
