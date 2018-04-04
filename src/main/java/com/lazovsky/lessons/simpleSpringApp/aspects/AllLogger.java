package com.lazovsky.lessons.simpleSpringApp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AllLogger {


    @Pointcut("execution(* *.see(..))")
    private void logger(){}

    @Before("logger()")
    public void logBefore(){
        System.out.println("hello!!!!!!!!!!!!!!!!!!");
    }

}