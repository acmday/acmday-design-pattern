package com.acmday.design.pattern.server.facade;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Waiter {

    public void Order(String coffeeName) {

        Cup cup = new Cup(Cup.CupType.CoffeeCup);
        Water water = new Water();
        Coffee coffee = new Coffee(coffeeName);

        Cooker cooker = new Cooker();
        cooker.CookCoffee(coffee, cup, water);
    }
}
