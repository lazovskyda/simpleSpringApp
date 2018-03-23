package com.lazovsky.lessons.simpleSpringApp.impls;

import com.lazovsky.lessons.simpleSpringApp.interfaces.Robot;
import com.lazovsky.lessons.simpleSpringApp.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor{
    @Override
    public abstract Robot createRobot();
}
