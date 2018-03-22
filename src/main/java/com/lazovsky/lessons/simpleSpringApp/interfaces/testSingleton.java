package com.lazovsky.lessons.simpleSpringApp.interfaces;

public class testSingleton {
    private static testSingleton ourInstance = new testSingleton();

    public static testSingleton getInstance() {
        return ourInstance;
    }

    private testSingleton() {
    }
}
