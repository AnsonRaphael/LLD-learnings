package com.nanos.creational.factoryDP;

public class CatCreator extends AnimalCreator{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
