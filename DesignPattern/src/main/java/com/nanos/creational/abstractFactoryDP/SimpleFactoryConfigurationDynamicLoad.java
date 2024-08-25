package com.nanos.creational.abstractFactoryDP;

import com.nanos.creational.abstractFactoryDP.util.ConfigLoader;
import com.nanos.creational.abstractFactoryDP.util.DynamicConfigLoader;

import java.net.URISyntaxException;

public class SimpleFactoryConfigurationDynamicLoad {
    private static DynamicConfigLoader configLoader;
    public static GUIFactory getFactory(){
        String osType = configLoader.getProperty("type");
        if(osType.equalsIgnoreCase("windows")){
            return new WindowsFactory();
        } else if (osType.equalsIgnoreCase("mac")) {
            return new MacFactory();
        }
        throw new IllegalArgumentException("Unknown OS type");
    }
    public static void loadConfig(String configPath) throws URISyntaxException {
        configLoader = new DynamicConfigLoader(configPath);
    }
}
