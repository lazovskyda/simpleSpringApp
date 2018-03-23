package com.lazovsky.lessons.simpleSpringApp.impls.pool;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;
import com.lazovsky.lessons.simpleSpringApp.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotCollection;

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }


    public void action(){
        for (Robot robot : robotCollection){
            robot.action();
        }
    }

}
