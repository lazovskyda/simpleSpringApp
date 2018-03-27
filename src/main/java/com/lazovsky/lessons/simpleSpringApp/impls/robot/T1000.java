package com.lazovsky.lessons.simpleSpringApp.impls.robot;

import com.lazovsky.lessons.simpleSpringApp.impls.toshiba.ToshibaHand;
import com.lazovsky.lessons.simpleSpringApp.impls.toshiba.ToshibaHead;
import com.lazovsky.lessons.simpleSpringApp.impls.toshiba.ToshibaLegs;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration("default")
//@Qualifier(value = "t1000")
public class T1000 extends BaseModel {
    private String color;
    private int year;
    private boolean soundEnable;

    public T1000() {
        System.out.println("T100 model constructor");
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public T1000 t1000(){
        return new T1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public T1000 t2000(){
//        return new T1000();
        return new T1000(1985, "red", true);
    }


    public T1000(Head head, Hand hand, Leg leg) {
        super(head, hand, leg);
    }
    public T1000(int year, String color, boolean soundEnable) {
        this.year = year;
        this.color = color;
        this.soundEnable = soundEnable;
    }


    public T1000(Head head, Hand hand, Leg leg, int year, String color, boolean soundEnable) {
        super(head, hand, leg);
        this.year = year;
        this.color = color;
        this.soundEnable = soundEnable;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void initObject() {
        System.out.println("init");
    }

    public void destroyObject() {
        System.out.println("destroy");
    }
}


