package com.acmday.design.pattern.server.service;

import com.acmday.design.pattern.server.service.impl.CctvNewsSubject;
import com.acmday.design.pattern.server.service.impl.DriverObserver;
import com.acmday.design.pattern.server.service.impl.TeacherObserver;
import org.junit.Test;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 行为型模式共十一种：
 * 策略模式、模板方法模式、观察者模式、迭代子模式、
 * 责任链模式、命令模式、备忘录模式、状态模式、
 * 访问者模式、中介者模式、解释器模式。
 */
public class BehaviorType {

    /**
     * 背景： 老师和司机都订阅了中央电视台的新闻，当他们收到新闻信息后，会做出不同的处理。
     */
    @Test
    public void observer() {

        Subject subject = new CctvNewsSubject();
        TeacherObserver teacherObserver = new TeacherObserver();
        subject.add(teacherObserver);
        DriverObserver driverObserver = new DriverObserver();
        subject.add(driverObserver);

        subject.notifyObserver("明天是晴天！");
        subject.remove(teacherObserver);
        subject.notifyObserver("后屯路交通管制！");
    }
}
