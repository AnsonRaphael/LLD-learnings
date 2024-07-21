package com.nanos.observerDP.observer;

import com.nanos.observerDP.observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{
    String phone;
    StockObservable observable;
    public MobileNotificationAlertObserver(String phone, StockObservable observable){
        this.phone = phone;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("SMS sent to mobile +"+phone+" as stock updated to "+observable.getStock());
    }
}
