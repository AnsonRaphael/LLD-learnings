package com.nanos.creational.abstractFactoryDP.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    private Properties properties =  new Properties();

    public ConfigLoader(String filepath){
        try(InputStream input =  getClass().getClassLoader().getResourceAsStream(filepath)){
            properties.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
