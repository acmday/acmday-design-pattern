package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.adapter.*;
import com.acmday.design.pattern.server.decorator.*;
import com.acmday.design.pattern.server.facade.Waiter;
import com.acmday.design.pattern.server.proxy.Client;
import org.junit.Test;

import static com.acmday.design.pattern.server.flyweight.Client.compositFlyWeight;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 结构型模式共七种：外观模式、适配器模式、代理模式、装饰器模式、桥接模式、组合模式、享元模式。
 */
public class StructureType {

    @Test
    public void flyweight() {
        compositFlyWeight();
        //pureFlyWeight();
    }

    @Test
    public void decorate() {
        Cake cake = new Cake();
        System.out.println(cake.getDescription()+"总共花费：$"+cake.cost());

        FruitDecorator fruitDecorator = new FruitDecorator(cake);
        System.out.println(fruitDecorator.getDescription()+"总共花费：$"+fruitDecorator.cost());

        CandleDecroator candleDecroator = new CandleDecroator(fruitDecorator);
        System.out.println(candleDecroator.getDescription()+"总共花费：$"+candleDecroator.cost());
    }

    @Test
    public void proxy() {
        Client.dynamicProxy();
        System.out.println("==================");
        Client.staticProxy();
    }

    @Test
    public void adapter() {
        //ObjectAdapter
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.fly();
        duck.quack();
        System.out.println("===================");

        //ClassAdapter
        PowerTarget target = new PowerAdapter();
        int value = target.output5v();
        System.out.println("value="+value);
    }

    @Test
    public void facade() {
        Waiter waiter = new Waiter();
        waiter.Order("摩卡");
    }
}
