package com.lazovsky.lessons.simpleSpringApp.impls.pool;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;
import com.lazovsky.lessons.simpleSpringApp.interfaces.RobotPool;


import java.util.Map;

public class T1000Pool implements RobotPool {

    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection){
        this.robotCollection = robotCollection;
    }


    @Override
    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }


    public void action() {
        robotCollection.forEach((s, robot) -> robot.action());

    }

}
