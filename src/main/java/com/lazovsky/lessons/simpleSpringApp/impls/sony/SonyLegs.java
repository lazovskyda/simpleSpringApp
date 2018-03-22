package com.lazovsky.lessons.simpleSpringApp.impls.sony;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;

public class SonyLegs implements Leg {
    @Override
    public void go() {
        System.out.println("Sony goes");
    }
}
