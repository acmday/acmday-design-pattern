package com.acmday.design.pattern.server.decorator;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class FruitDecorator extends AbstractDecorator {

    AbstractSweetFood sweetFood;

    public FruitDecorator(AbstractSweetFood sweetFood) {
        this.sweetFood = sweetFood;
    }

    @Override
    public String getDescription() {
        return sweetFood.getDescription() + ", 一份水果";
    }

    @Override
    public double cost() {
        return sweetFood.cost() + 10;
    }
}
