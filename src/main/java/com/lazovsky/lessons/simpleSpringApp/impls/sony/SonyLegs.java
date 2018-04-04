package com.lazovsky.lessons.simpleSpringApp.impls.sony;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SonyLegs implements Leg {
    @Override
    public void go() {
        System.out.println("Sony goes");
    }
}
