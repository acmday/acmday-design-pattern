package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 * 这个接口在策略模式中是核心，针对不同的策略有不同的实现。
 */
public interface IStrategy {

    /**
     * 方法可以有多个，只要是各个策略都共有的就行。
     * @param standardPrice
     * @return
     */
    double getPrice(double standardPrice);
}
