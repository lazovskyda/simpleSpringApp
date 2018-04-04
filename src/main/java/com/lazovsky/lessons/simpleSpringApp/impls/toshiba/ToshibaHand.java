package com.lazovsky.lessons.simpleSpringApp.impls.toshiba;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {
    @Override
    public void take() {
        System.out.println("Tohiba take");
    }
}
