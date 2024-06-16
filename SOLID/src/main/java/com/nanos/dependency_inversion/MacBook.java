package com.nanos.dependency_inversion;

// class should depend on interface rather than concrete class. Dependency on type of concrete class to be used to for initialisation is ofloeaded to client rather thatn the class itself
public class MacBook {
private Keyboard keyboard;
private Mouse mouse;
public MacBook(Keyboard keyboard, Mouse mouse){
    this.keyboard = keyboard;
    this.mouse = mouse;
}
}
