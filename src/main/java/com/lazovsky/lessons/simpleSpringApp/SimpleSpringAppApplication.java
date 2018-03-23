package com.lazovsky.lessons.simpleSpringApp;


import com.lazovsky.lessons.simpleSpringApp.impls.pool.T1000Pool;
import com.lazovsky.lessons.simpleSpringApp.impls.robot.T1000;
import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;
import com.lazovsky.lessons.simpleSpringApp.interfaces.RobotConveyor;
import com.lazovsky.lessons.simpleSpringApp.interfaces.RobotPool;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SimpleSpringAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans/application_context.xml");
        //RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");


//        Robot terminator1 = t1000Conveyor.createRobot();
//        Robot terminator2 = t1000Conveyor.createRobot();
//        Robot terminator3 = t1000Conveyor.createRobot();

//        System.out.println("terminator1" + terminator1);
//        System.out.println("terminator2" + terminator2);
//        System.out.println("terminator3" + terminator3);


        t1000Pool.action();
        //System.out.println(t1000Pool.getRobotCollection());
        t1000Pool.getRobotCollection().forEach(robot -> {
                    T1000 test = new T1000();
                    System.out.println(robot);
                    test = (T1000) robot;
                    System.out.println( test.getColor() );

                }
        );

        T1000 firstRobot = (T1000) context.getBean("t1000");
        System.out.println(firstRobot);
        System.out.println(firstRobot.getYear());


//		SpringApplication.run(SimpleSpringAppApplication.class, args);
//		SonyHead head = new SonyHead();
//		SonyHand hand = new SonyHand();
//		SonyLegs legs = new SonyLegs();
//
//		T1000 firstRobot = new T1000(hand, head, legs);

//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans/t1000_context.xml");
        //       T1000 firstRobot = (T1000) context.getBean("t1000");
//        T1000 secondRobot = (T1000) context.getBean("t1000");
//
//        firstRobot.dance();
//
////        System.out.println(firstRobot.getHead().equals(secondRobot.getHead()));
//
//        System.out.println(firstRobot.getYear());
//        System.out.println(firstRobot.getColor());
//        System.out.println(firstRobot.getSoundEnable());
//
//        System.out.println(firstRobot);
//        System.out.println(secondRobot);

//		System.out.println(firstRobot.getColor());
//		System.out.println(firstRobot.getYear());

    }
}
