package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class OldCustomerFewStrategy implements IStrategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老客户小批量，打八折");
        return standardPrice * 0.8;
    }
}
