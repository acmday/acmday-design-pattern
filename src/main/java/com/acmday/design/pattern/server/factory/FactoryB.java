package com.acmday.design.pattern.server.factory;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class FactoryB implements Factory {
    @Override
    public Product makeProduct() {
        return new ProductB();
    }
}
