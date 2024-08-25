package com.nanos.creational.abstractFactoryDP;

public class WindowButton implements Button{
    @Override
    public void click() {
        System.out.println("Window button Clicked");
    }

    @Override
    public Button clone() {
        return new WindowButton();
    }
}
