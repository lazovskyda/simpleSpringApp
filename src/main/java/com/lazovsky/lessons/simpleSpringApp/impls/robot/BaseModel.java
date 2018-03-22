package com.lazovsky.lessons.simpleSpringApp.impls.robot;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Hand;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Head;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Leg;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;

public abstract class BaseModel implements Robot{

    private Head head;
    private Hand hand;
    private Leg leg;


    public BaseModel(){
        System.out.println("Base model constructor");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        this();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }


    @Override

    public void action() {
        head.see();
        hand.take();

    }

    @Override
    public void dance() {
        head.see();
        leg.go();
    }
}


