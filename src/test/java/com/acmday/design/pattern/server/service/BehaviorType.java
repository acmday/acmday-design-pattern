package com.acmday.design.pattern.server.service;

import com.acmday.design.pattern.server.bo.BusinessReport;
import com.acmday.design.pattern.server.service.impl.CctvNewsSubject;
import com.acmday.design.pattern.server.service.impl.CeoVisitor;
import com.acmday.design.pattern.server.service.impl.CtoVisitor;
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
     *《访问者模式》访问者模式是一种将数据操作和数据结构分离的设计模式。
     *《使用场景》
     *  1，对象结构比较稳定，但经常需要在此对象结构上定义新的操作。
     *  2，需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。
     *
     *《背景》
     * CEO和CTO年底开始评定员工一年的工作绩效，员工分为工程师和经理，CTO关注工程师的代码量、经理的新产品数量；CEO关注的是工程师的KPI和经理的KPI以及新产品数量。
     * 由于CEO和CTO对于不同员工的关注点是不一样的，这就需要对不同员工类型进行不同的处理。访问者模式此时可以派上用场了。
     */
    @Test
    public void visitor() {
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CeoVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CtoVisitor());
    }

    /**
     *《观察者模式》
     *《背景》 老师和司机都订阅了中央电视台的新闻，当他们收到新闻信息后，会做出不同的处理。
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

        // TODO: 2020/7/18  委托事件模型
    }
}
