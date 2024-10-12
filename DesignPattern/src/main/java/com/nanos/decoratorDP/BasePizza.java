package com.nanos.decoratorDP;

import java.util.List;

public abstract class BasePizza {
    public abstract int cost();
    public abstract List<String> getIngrediants();
    public abstract List<String> getToppings();
}
