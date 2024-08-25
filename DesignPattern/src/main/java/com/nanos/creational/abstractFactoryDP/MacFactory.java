package com.nanos.creational.abstractFactoryDP;

public class MacFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
