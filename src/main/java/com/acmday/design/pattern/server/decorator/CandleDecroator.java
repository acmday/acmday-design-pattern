package com.acmday.design.pattern.server.decorator;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class CandleDecroator extends AbstractDecorator {

    AbstractSweetFood sweetFood;

    public CandleDecroator(AbstractSweetFood sweetFood) {
        this.sweetFood = sweetFood;
    }

    @Override
    public String getDescription() {
        return sweetFood.getDescription() + ", 一份蜡烛";
    }

    @Override
    public double cost() {
        return sweetFood.cost() + 10;
    }
}
