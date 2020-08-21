package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.abstractFactory.AbstractFactory;
import com.acmday.design.pattern.server.abstractFactory.AppleFactory;
import com.acmday.design.pattern.server.abstractFactory.MiFactory;
import com.acmday.design.pattern.server.builder.Person;
import com.acmday.design.pattern.server.builder.User;
import com.acmday.design.pattern.server.factory.Factory;
import com.acmday.design.pattern.server.factory.FactoryA;
import com.acmday.design.pattern.server.factory.FactoryB;
import com.acmday.design.pattern.server.prototype.AbstractShape;
import com.acmday.design.pattern.server.prototype.ShapeCache;
import com.acmday.design.pattern.server.singleton.Singleton;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.Date;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 创建型模式5种：建造者模式、原型模式、工厂方法模式、抽象工厂模式、单例模式
 */
public class BuildType {

    @Test
    public void singleton() {
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0; i < 100000; i++) {
            Singleton.getInstance();
            //Singleton.getInstanceCmp();
        }
        watch.stop();
        System.out.println(watch.prettyPrint());
    }

    @Test
    public void abstractFactory() {
        AbstractFactory miFactory = new MiFactory();
        AbstractFactory appleFactory = new AppleFactory();

        miFactory.makeComputer().show();
        miFactory.makePhone().show();

        appleFactory.makeComputer().show();
        appleFactory.makePhone().show();
    }

    @Test
    public void factory() {
        Factory factoryA = new FactoryA();
        factoryA.makeProduct().show();

        Factory factoryB = new FactoryB();
        factoryB.makeProduct().show();
    }

    @Test
    public void prototype() {

        ShapeCache.loadCache();

        AbstractShape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        AbstractShape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        AbstractShape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

    @Test
    public void builder() {
        // 例子一
        Person.Builder builder = new Person.Builder("acmday", "male", new Date(), "xxx@sina.com");
        Person ocean = builder.height(171).addr("Beijing").nickName("海洋").build();
        System.out.println(ocean.toString());

        // 例子二
        User user = User.builder().id(10010).name("acmday").addr("Beijing").age(20).build();
        System.out.println(user.toString());
    }
}
