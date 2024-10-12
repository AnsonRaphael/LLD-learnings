package com.nanos.decoratorDP;

import java.util.ArrayList;
import java.util.List;

public class ExtraCheese extends Toppings{

    BasePizza basePizza;

    public ExtraCheese (BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() +10;
    }

    @Override
    public List<String> getIngrediants() {
        return this.basePizza.getIngrediants();
    }

    @Override
    public List<String> getToppings() {
        List<String> data = new ArrayList<>(this.basePizza.getToppings());
        data.add("extra cheese");
        return data;
    }
}
