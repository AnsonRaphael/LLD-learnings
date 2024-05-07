package com.nanos.singleresponsibility;

// this is wrong as per single responsibility principle.
// Here Invoice class is responsible for calculation of invoice, printing , saving to DB.
//Any change in any of the logic will result in change in this class
public class InvoiceWrong {

    private Marker marker;
    private int quantity;

    public InvoiceWrong(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = marker.getPrice() * quantity;
        return price;
    }

    public void printInvoice(){
        // logic
    }

    public void saveToDB(){
        //logic
    }
}
