package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.adapter.*;
import com.acmday.design.pattern.server.bridge.AbstractRoad;
import com.acmday.design.pattern.server.bridge.Bus;
import com.acmday.design.pattern.server.bridge.CementRoad;
import com.acmday.design.pattern.server.composite.File;
import com.acmday.design.pattern.server.composite.Folder;
import com.acmday.design.pattern.server.decorator.Cake;
import com.acmday.design.pattern.server.decorator.CandleDecroator;
import com.acmday.design.pattern.server.decorator.FruitDecorator;
import com.acmday.design.pattern.server.facade.Waiter;
import com.acmday.design.pattern.server.proxy.Client;
import org.junit.Test;

import static com.acmday.design.pattern.server.flyweight.Client.compositFlyWeight;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 结构型模式共七种：外观模式、适配器模式、代理模式、装饰器模式、享元模式、桥接模式、组合模式。
 */
public class StructureType {

    @Test
    public void composite() {
        Folder srcFolder = new Folder("src");
        File readme1 = new File("README.md", "这里是src目录");

        Folder mainFolder = new Folder("main");
        File readme2 = new File("README.md", "这里是main目录");

        Folder javaFolder = new Folder("java");
        File hello = new File("HelloWorld.java", "这里是java目录");

        srcFolder.add(readme1);
        srcFolder.add(mainFolder);

        mainFolder.add(readme2);

        mainFolder.add(javaFolder);
        javaFolder.add(hello);

        srcFolder.print();
    }

    @Test
    public void bridge() {
        AbstractRoad road = new CementRoad(new Bus());
        road.driveOnRoad();
    }

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
