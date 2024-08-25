package com.nanos.creational.abstractFactoryDP;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args ) throws Exception {
        // GUIFactory is preferd in interface as concrete factory can extend some other class if it is made only interface
        //Abstract Factory Pattern deals with product families  while factroy pattern deals with single items

     GUIFactory  windowsFactory =  new WindowsFactory();
     Button button = windowsFactory.createButton();
     CheckBox checkBox = windowsFactory.createCheckbox();
     button.click();
     checkBox.select();
     GUIFactory macFactory = new MacFactory();
     button =  macFactory.createButton();
     checkBox = macFactory.createCheckbox();
     button.click();
     checkBox.select();


     // vartaions
        //  The client code doesn't directly instantiate the factory; instead, it loads a configuration to
        //  choose the appropriate factory at runtime.
        String workingDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + workingDirectory);
        SimpleFactoryConfiguration.loadConfig("config.properties");// load data from external component
        GUIFactory simpleFactory = SimpleFactoryConfiguration.getFactory();
        button = simpleFactory.createButton();
        button.click();
        //------
        SimpleFactoryConfigurationDynamicLoad.loadConfig("dynamic_config.properties");// load data from external component
        simpleFactory = SimpleFactoryConfigurationDynamicLoad.getFactory();
        button = simpleFactory.createButton();
        button.click();

        //reflective
        System.out.println("-----------reflective-------");
        GUIFactory reflectivefactory = ReflectionBasedFactory.createFactory("mac");
        reflectivefactory.createButton().click();


        //factoryKit
        // here we use stream api to create map of factory and create button based on those map
        System.out.println("-----------FactoryKit-------");
        ButtonFactory buttonFactory = ButtonFactory.factory(builder -> {
            builder.add(OS.WINDOWS, WindowButton::new);
            builder.add(OS.MAC,MacButton::new);

        });


        // Prototype-based Factory
        // here colone of prto object is used, to create new similar object. This is useful to
        // copy the state of original proto and to make object creation of complex object effiient
        //Cloning bypasses the constructor and copies the object's fields directly. This can be significantly faster
        // if the object’s initialization logic (n/w calls)is complex or time-consuming.
        System.out.println("-----------Prototype-------");
        ButtonProtoTypeFactory buttonProtoTypeFactory = new ButtonProtoTypeFactory();
        button= buttonProtoTypeFactory.createButton(OS.WINDOWS.name());
        button.click();
        button = buttonProtoTypeFactory.createButton(OS.MAC.name());
        button.click();




    }
}
