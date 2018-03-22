package com.lazovsky.lessons.simpleSpringApp.impls.sony;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;

public class SonyHead implements Head {
    @Override
    public void think() {
        System.out.println("Sony think");
    }

    @Override
    public void see() {
        System.out.println("Sony looks");
    }
}
