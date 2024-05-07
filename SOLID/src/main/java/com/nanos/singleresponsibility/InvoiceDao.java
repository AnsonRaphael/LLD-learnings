package com.nanos.singleresponsibility;
// Correct as per Single responsibility principle - just saving invoice object
public class InvoiceDao {

    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        // logic
    }
}
