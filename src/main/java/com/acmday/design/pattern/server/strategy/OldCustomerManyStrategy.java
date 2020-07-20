package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class OldCustomerManyStrategy implements IStrategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老客户大批量，打七折");
        return standardPrice * 0.7;
    }
}
