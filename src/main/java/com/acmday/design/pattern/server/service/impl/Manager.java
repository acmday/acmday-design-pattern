package com.acmday.design.pattern.server.service.impl;

import com.acmday.design.pattern.server.service.Visitor;
import com.acmday.design.pattern.server.service.abstracts.AbstractStaff;

import java.util.Random;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class Manager extends AbstractStaff {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(20);
    }
}
