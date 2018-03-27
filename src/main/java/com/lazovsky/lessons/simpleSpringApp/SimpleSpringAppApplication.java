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
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans/all_context.xml");

        T1000 t1000 = (T1000) context.getBean("t1000");
        T1000 t2000 = (T1000) context.getBean("t2000");

        t1000.action();
        t1000.dance();

        t2000.action();
        t2000.dance();

    }
}
