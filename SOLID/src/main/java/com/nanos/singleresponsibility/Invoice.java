package com.nanos.singleresponsibility;

// Correct as per Single responsibility principle - just calculate total
public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = marker.getPrice() * quantity;
        return price;
    }
}
