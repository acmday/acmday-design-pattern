package com.acmday.design.pattern.server.abstractFactory;

/**
 * @author wushaofeng.
 * @date 2020/8/19.
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public Product makePhone() {
        return new IphoneProduct();
    }

    @Override
    public Product makeComputer() {
        return new MacProduct();
    }
}
