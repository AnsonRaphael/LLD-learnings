package com.nanos.creational.abstractFactoryDP;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac button Clicked");
    }

    @Override
    public Button clone() {
        return new MacButton();
    }
}
