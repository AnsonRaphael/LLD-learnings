package com.nanos.creational.abstractFactoryDP.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.Properties;

public class DynamicConfigLoader {
    WatchService watchService;
    Path dynamicConfigPath;
    Properties properties= new Properties();

    public DynamicConfigLoader(String filePath) throws URISyntaxException {
        URL file = getClass().getClassLoader().getResource(filePath);
        dynamicConfigPath = Paths.get(file.toURI());
        loadDynamicConfig();

    }

    private void loadDynamicConfig() {
        try (FileInputStream fileInputStream = new FileInputStream(dynamicConfigPath.toFile())){
            properties.load(fileInputStream);
            System.out.println("Configuration loaded");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

    private void watchConfig() throws IOException {
        watchService = FileSystems.getDefault().newWatchService();
        dynamicConfigPath.getParent().register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        new Thread(()->{
            while (true){
                try{
                    WatchKey key = watchService.take();
                    for(WatchEvent<?> event : key.pollEvents()){
                        if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY &&
                        dynamicConfigPath.getFileName().equals(event.context())){
                            loadDynamicConfig();
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
