package com.nanos.decoratorDP;

import java.util.ArrayList;
import java.util.List;

public class Margerita extends BasePizza{
    int cost;
    List<String> ingrediants;
    List<String> Toppings;

    public Margerita(){
        this.cost=100;
        this.ingrediants =  new ArrayList<>();
        this.Toppings =  new ArrayList<>();
        ingrediants.add("margerita cheese");
        ingrediants.add("base");
    }
    @Override
    public int cost() {
        return this.cost;
    }

    @Override
    public List<String> getIngrediants() {
        return this.ingrediants;
    }

    @Override
    public List<String> getToppings() {
        return this.Toppings;
    }
}
