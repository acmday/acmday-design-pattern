package com.acmday.design.pattern.server;

import com.acmday.design.pattern.server.facade.Waiter;
import org.junit.Test;

/**
 * @author acmday.
 * @date 2020/7/16.
 * 结构型模式共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
 */
public class StructureType {

    @Test
    public void facade() {
        Waiter waiter = new Waiter();
        waiter.Order("摩卡");
    }
}
