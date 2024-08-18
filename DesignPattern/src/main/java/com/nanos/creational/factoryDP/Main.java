package com.nanos.creational.factoryDP;

public class Main {

    public static void main(String[] args) {

        //The client code is decoupled from the object creation logic.
        //Single Responsibility: The responsibility for creating objects is isolated from the rest of the code.
        AnimalCreator animalCreator = new DogCreator();
        Animal dog = animalCreator.createAnimal();
        dog.speak();
        animalCreator = new CatCreator();
        Animal cat = animalCreator.createAnimal();
        cat.speak();
        //Increased Complexity: Adding an extra layer of abstraction can increase the complexity of the code.
        //It can lead to subclass proliferation, where each type of product has a corresponding factory subclass,
        // which can bloat the codebase.

        // Parameterized Factory
        //Provides more flexibility by allowing subclasses to override the factory method.
        ParameterizedAnimalFactory parameterizedAnimalFactory = new ConcreteParameterizedAnimalFactory();
        Animal dog1 = parameterizedAnimalFactory.createAnimal("dog");
        dog1.speak();
        Animal cat1 = parameterizedAnimalFactory.createAnimal("cat");
        cat1.speak();

        //Static Factory Method
        //Simpler than parameterized factories but less extensible since it cannot be overridden by subclasses.
        Animal dog12 = StaticAnimalFactory.createAnimal("dog");
        dog12.speak();
        Animal cat12 = StaticAnimalFactory.createAnimal("cat");
        cat12.speak();

        //Parameterized Factory offers more flexibility by allowing parameterized object creation
        // and the ability to override factory methods in subclasses.
        //Static Factory Method is simpler, doesn’t involve inheritance, and is more appropriate for
        // straightforward object creation logic.


    }
}
