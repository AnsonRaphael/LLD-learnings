package com.nanos.creational.abstractFactoryDP;

import java.util.HashMap;
import java.util.Map;

public class ReflectionBasedFactory {
    private static final Map<String,Class<? extends GUIFactory>> registeredFactory = new HashMap<>();

    static{
        registeredFactory.put("windows", WindowsFactory.class);
        registeredFactory.put("mac",MacFactory.class);
    }
    public static GUIFactory createFactory(String osType) throws Exception {
        Class<? extends GUIFactory> factoryClass = registeredFactory.get(osType);
        if(factoryClass !=null){
            return factoryClass.getDeclaredConstructor().newInstance();
        }
        throw new IllegalArgumentException();
    }
}
