package com.nanos.openclose;

import com.nanos.singleresponsibility.Invoice;

// new requirement to save invoice to file also,
// if we add another function to already available invoice class , that violate open/closed principles
// Using Invoice Dao we can make the function extensible while closing each logic class for modification.
public interface InvoiceDao {
    public void save(Invoice invoice);
}
