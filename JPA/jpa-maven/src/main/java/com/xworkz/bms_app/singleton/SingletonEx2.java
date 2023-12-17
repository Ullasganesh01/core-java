package com.xworkz.bms_app.singleton;

public class SingletonEx2 {
    private static final SingletonEx2 instance = new SingletonEx2();

    private SingletonEx2() {}

    public static SingletonEx2 getInstance() {
        return instance;
    }
}
