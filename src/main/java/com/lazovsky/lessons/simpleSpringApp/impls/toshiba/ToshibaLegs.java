package com.lazovsky.lessons.simpleSpringApp.impls.toshiba;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;
import org.springframework.stereotype.Component;



public class ToshibaLegs implements Leg {
    @Override
    public void go() {
        System.out.println("Tohiba goes");
    }
}
