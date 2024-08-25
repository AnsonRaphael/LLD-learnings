package com.nanos.creational.abstractFactoryDP;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface ButtonFactory {
    Button createButton(OS os);

    static ButtonFactory factory(Consumer<Builder> consumer){
        Map<OS,Supplier<Button>> map = new HashMap<>();
        consumer.accept(map::put);
        return os-> map.get(os).get();
    }

    interface Builder{
        void add(OS os, Supplier<Button> supplier);
    }
}
