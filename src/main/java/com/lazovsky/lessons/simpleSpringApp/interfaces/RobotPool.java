package com.lazovsky.lessons.simpleSpringApp.interfaces;

import java.util.Collection;
import java.util.Map;

public interface RobotPool {
    //Collection<Robot> getRobotCollection();
    Map<String, Robot> getRobotCollection();
}
