package com.lazovsky.lessons.simpleSpringApp.impls.toshiba;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;
import org.springframework.stereotype.Component;


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
