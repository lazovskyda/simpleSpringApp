package com.lazovsky.lessons.simpleSpringApp.impls.sony;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;

public class SonyHand implements Hand {
    @Override
    public void take() {
        System.out.println("Sony take");
    }
}
