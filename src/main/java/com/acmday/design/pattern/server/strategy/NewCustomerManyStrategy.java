package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class NewCustomerManyStrategy implements IStrategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("新客户大批量，打九折");
        return standardPrice * 0.9;
    }
}
