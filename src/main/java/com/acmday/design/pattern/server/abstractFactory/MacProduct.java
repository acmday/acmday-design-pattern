package com.acmday.design.pattern.server.abstractFactory;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class MacProduct implements Product {
    @Override
    public void show() {
        System.out.println("MacProduct");
    }
}
