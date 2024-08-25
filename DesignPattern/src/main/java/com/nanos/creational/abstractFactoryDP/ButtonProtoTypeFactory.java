package com.nanos.creational.abstractFactoryDP;

import java.util.HashMap;
import java.util.Map;

public class ButtonProtoTypeFactory {
    private Map<String,Button> buttonMap = new HashMap<>();

    public ButtonProtoTypeFactory(){
        buttonMap.put(OS.WINDOWS.name(), new WindowButton());
        buttonMap.put(OS.MAC.name(), new MacButton());
    }
    public Button createButton(String type){
        Button protoButton = buttonMap.get(type);
        if(protoButton!=null){
            return protoButton.clone();
        }
        throw new IllegalArgumentException();
    }

}
