package com.nanos.singleresponsibility;
// Correct as per Single responsibility principle
public class Marker {

    String name;
    String color;
    int year;
    int price;

    public Marker (String name, String color, int year,int price){
        this.color = color;
        this.name = name;
        this.year = year;
        this.price = price;
    }
}
