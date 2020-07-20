package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class NewCustomerFewStrategy implements IStrategy {

    @Override
    public double getPrice(double standardPrice) {

        System.out.println("新客户小批量，不打折");
        return standardPrice;
    }
}
