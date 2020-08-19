package com.acmday.design.pattern.server.decorator;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Cake extends AbstractSweetFood {

    @Override
    public String getDescription() {
        return "一个蛋糕";
    }

    @Override
    public double cost() {
        return 50;
    }
}
