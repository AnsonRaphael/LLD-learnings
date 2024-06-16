package com.nanos.dependency_inversion;


public class Main {
    public static void main(String[] args) {
        MacBook macBook = new MacBook(new WiredKeyBoard(),new WiredMouse());
    }
}
