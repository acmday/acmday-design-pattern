package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.builder.*;
import com.acmday.design.pattern.server.prototype.AbstractShape;
import com.acmday.design.pattern.server.prototype.ShapeCache;
import org.junit.Test;

import java.util.Date;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 创建型模式5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 */
public class BuildType {

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
