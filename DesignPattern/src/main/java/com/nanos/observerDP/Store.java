package com.nanos.observerDP;

import com.nanos.observerDP.observable.IphoneStockObservable;
import com.nanos.observerDP.observable.StockObservable;
import com.nanos.observerDP.observer.EmailNotificationAlertObserver;
import com.nanos.observerDP.observer.MobileNotificationAlertObserver;
import com.nanos.observerDP.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StockObservable observable  = new IphoneStockObservable();
        // customers clicks notfy iphone with email or phone
        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("obs1@gmail.com",observable);
        observable.add(observer1);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("obs2@gmail.com",observable);
        observable.add(observer2);
        NotificationAlertObserver observer3 = new MobileNotificationAlertObserver("123456789",observable);
        observable.add(observer3);

        //lets update stock
        observable.setStock(3);
    }
}
