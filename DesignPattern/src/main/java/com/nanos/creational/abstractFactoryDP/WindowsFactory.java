package com.nanos.creational.abstractFactoryDP;

public class WindowsFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new WindowButton();
    }

    @Override
    CheckBox createCheckbox() {
        return new WindowCheckBox();
    }
}

