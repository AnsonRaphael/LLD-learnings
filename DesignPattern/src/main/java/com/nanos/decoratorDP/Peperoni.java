package com.nanos.decoratorDP;

import java.util.ArrayList;
import java.util.List;

public class Peperoni extends Toppings{

    BasePizza basePizza;

    public Peperoni(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() +30;
    }

    @Override
    public List<String> getIngrediants() {
        return this.basePizza.getIngrediants();
    }

    @Override
    public List<String> getToppings() {
        List<String> data = new ArrayList<>(this.basePizza.getToppings());
        data.add("peperoni");
        return data;
    }
}
