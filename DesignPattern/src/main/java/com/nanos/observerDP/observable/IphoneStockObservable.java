package com.nanos.observerDP.observable;

import com.nanos.observerDP.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<NotificationAlertObserver> observers = new ArrayList<NotificationAlertObserver>();
    int stock =0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obs :observers){
            obs.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(this.stock == stock){
            return;
        }
        this.stock=stock;
        notifySubscribers();
    }

    @Override
    public int getStock() {
        return stock;
    }
}
