package com.acmday.design.pattern.server.observer;

import com.acmday.design.pattern.server.visitor.Visitor;

import java.util.Random;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public abstract class AbstractStaff {

    public String name;
    public int kpi;

    public AbstractStaff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接受Visitor的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
