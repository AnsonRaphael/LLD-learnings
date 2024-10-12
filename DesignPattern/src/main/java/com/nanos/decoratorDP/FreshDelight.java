package com.nanos.decoratorDP;

import java.util.ArrayList;
import java.util.List;

public class FreshDelight extends BasePizza{
    int cost;
    List<String> ingrediants;
    List<String> Toppings;

    public FreshDelight(){
        this.cost=150;
        this.ingrediants =  new ArrayList<>();
        this.Toppings =  new ArrayList<>();
        ingrediants.add("cheese");
        ingrediants.add("base");
        ingrediants.add("onion");
        ingrediants.add("capsicum");
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
