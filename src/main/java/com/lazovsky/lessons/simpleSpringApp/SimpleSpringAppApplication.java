package com.lazovsky.lessons.simpleSpringApp;


import com.lazovsky.lessons.simpleSpringApp.impls.robot.T1000;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SimpleSpringAppApplication {

    public static void main(String[] args) {
//		SpringApplication.run(SimpleSpringAppApplication.class, args);
//		SonyHead head = new SonyHead();
//		SonyHand hand = new SonyHand();
//		SonyLegs legs = new SonyLegs();
//
//		T1000 firstRobot = new T1000(hand, head, legs);

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans/context.xml");
        T1000 firstRobot = (T1000) context.getBean("t1000");
        T1000 secondRobot = (T1000) context.getBean("t1000");

        firstRobot.dance();

//        System.out.println(firstRobot.getHead().equals(secondRobot.getHead()));

        System.out.println(firstRobot.getYear());
        System.out.println(firstRobot.getColor());
        System.out.println(firstRobot.getSoundEnable());

        System.out.println(firstRobot);
        System.out.println(secondRobot);

//		System.out.println(firstRobot.getColor());
//		System.out.println(firstRobot.getYear());

    }
}
