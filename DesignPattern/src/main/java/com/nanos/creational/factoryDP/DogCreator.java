package com.nanos.creational.factoryDP;

public class DogCreator extends AnimalCreator{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
