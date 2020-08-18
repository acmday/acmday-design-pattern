package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.builder.*;
import org.junit.Test;

import java.util.Date;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 创建型模式5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 */
public class BuildType {

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
