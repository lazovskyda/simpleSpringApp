package com.lazovsky.lessons.simpleSpringApp.impls.toshiba;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;

public class ToshibaHead implements Head {
    @Override
    public void think() {
        System.out.println("Tohiba think");
    }

    @Override
    public void see() {
        System.out.println("Tohiba looks");
    }
}
