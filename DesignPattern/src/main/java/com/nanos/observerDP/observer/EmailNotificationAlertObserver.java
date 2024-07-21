package com.nanos.observerDP.observer;

import com.nanos.observerDP.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable;

    public EmailNotificationAlertObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to "+email+" as stock updated to"+observable.getStock());
    }
}
