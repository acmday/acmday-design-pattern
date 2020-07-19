package com.acmday.design.pattern.server.visitor;

import com.acmday.design.pattern.server.observer.AbstractStaff;

import java.util.Random;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class Engineer extends AbstractStaff {
    public Engineer(String name) {
        super(name);
    }

    /**
     * 为Visitor开了个口子用于访问this.
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
