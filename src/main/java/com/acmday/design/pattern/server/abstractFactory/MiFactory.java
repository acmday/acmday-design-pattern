package com.acmday.design.pattern.server.abstractFactory;

/**
 * @author wushaofeng.
 * @date 2020/8/19.
 */
public class MiFactory extends AbstractFactory {

    @Override
    public Product makePhone() {
        return new MiPhoneProduct();
    }

    @Override
    public Product makeComputer() {
        return new MiComputerProduct();
    }
}
