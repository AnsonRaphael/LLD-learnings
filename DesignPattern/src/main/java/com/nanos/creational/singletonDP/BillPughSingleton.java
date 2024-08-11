package com.nanos.creational.singletonDP;

public class BillPughSingleton {

    private BillPughSingleton(){

    }
    private static class BillPughSingletonHelper{
        public static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.billPughSingleton;
    }
    public String getData(){
        return "BillPughSingleton data";
    }
}
