package com.nanos.creational.factoryDP;

public class ConcreteParameterizedAnimalFactory  extends ParameterizedAnimalFactory{

    public Animal createAnimal(String animal){
        if("dog".equals(animal)){
            return new Dog();
        } else if ("cat".equals(animal)) {
            return new Cat();
        }else{
            return null;
        }
    }
}
