package com.nanos.creational.abstractFactoryDP;

import com.nanos.creational.abstractFactoryDP.util.ConfigLoader;

public class SimpleFactoryConfiguration {
    private static ConfigLoader configLoader;
    public static GUIFactory getFactory(){
        String osType = configLoader.getProperty("type");
        if(osType.equalsIgnoreCase("windows")){
            return new WindowsFactory();
        } else if (osType.equalsIgnoreCase("mac")) {
            return new MacFactory();
        }
        throw new IllegalArgumentException("Unknown OS type");
    }
    public static void loadConfig(String configPath){
        configLoader = new ConfigLoader(configPath);
    }
}
