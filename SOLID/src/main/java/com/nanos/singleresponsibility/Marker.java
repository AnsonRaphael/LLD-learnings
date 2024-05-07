package com.nanos.singleresponsibility;
// Correct as per Single responsibility principle
public class Marker {

    private String name;
    private String color;
    private int year;
    private int price;

    public Marker (String name, String color, int year,int price){
        this.color = color;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
