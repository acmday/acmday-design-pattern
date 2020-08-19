package com.acmday.design.pattern.server.abstractFactory;

/**
 * @author wushaofeng.
 * @date 2020/8/19.
 */
public class IphoneProduct implements Product {
    @Override
    public void show() {
        System.out.println("IphoneProduct");
    }
}
