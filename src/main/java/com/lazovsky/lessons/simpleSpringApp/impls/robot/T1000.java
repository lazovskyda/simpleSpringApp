package com.lazovsky.lessons.simpleSpringApp.impls.robot;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;

public class T1000 extends BaseModel {
    private String color;
    private int year;
    private boolean soundEnable;

    public T1000() {
        System.out.println("T100 model constructor");
    }

    public T1000(Head head, Hand hand, Leg leg) {
        super(head, hand, leg);
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


