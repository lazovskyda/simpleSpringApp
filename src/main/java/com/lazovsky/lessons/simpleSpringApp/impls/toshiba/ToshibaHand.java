package com.lazovsky.lessons.simpleSpringApp.impls.toshiba;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void take() {
        System.out.println("Tohiba take");
    }
}
