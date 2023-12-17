package com.xworkz.bms_app.singleton;

public class SingletonEx1 {
    private static SingletonEx1 instance = null;

    private SingletonEx1() {}

    public static SingletonEx1 getInstance() {
        if (instance == null) {
            instance = new SingletonEx1();
        }
        return instance;
    }
}
