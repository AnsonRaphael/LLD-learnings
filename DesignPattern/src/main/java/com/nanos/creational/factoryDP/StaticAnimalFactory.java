package com.nanos.creational.factoryDP;

public class StaticAnimalFactory {
    public static Animal createAnimal(String animal){
        if("dog".equals(animal)){
            return new Dog();
        } else if ("cat".equals(animal)) {
            return new Cat();
        }else{
            return null;
        }
    }
}
