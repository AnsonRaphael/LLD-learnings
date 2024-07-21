package com.nanos.observerDP.observable;

import com.nanos.observerDP.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStock(int stock);
    int getStock();

}
