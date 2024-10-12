package com.nanos.decoratorDP;

public class Store {
    public static void main(String[] args) {
        BasePizza pizza = new Margerita();
        // add cheese
        display(pizza);
        pizza = new ExtraCheese(pizza);
        display(pizza);
    }

    public static void display(BasePizza pizza){
        System.out.println("cost "+pizza.cost());
        System.out.println("ingrdiants "+pizza.getIngrediants());
        System.out.println("Toppings "+pizza.getToppings());
    }
}
