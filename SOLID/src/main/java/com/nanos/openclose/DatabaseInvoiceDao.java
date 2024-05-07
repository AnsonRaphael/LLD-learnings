package com.nanos.openclose;

import com.nanos.singleresponsibility.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // logic to save to DB
    }
}
