package com.acmday.design.pattern.server.facade;


/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Cooker {

    public void CookCoffee(Coffee coffee,Cup cup,Water water) {
        System.out.println("煮咖啡：" + coffee.getCoffeeName());
        water.boil();
        coffee.prepareCoffee();
        cup.PrepareCup();
    }
}
