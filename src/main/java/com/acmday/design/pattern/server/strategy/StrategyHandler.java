package com.acmday.design.pattern.server.strategy;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class StrategyHandler {

    private IStrategy strategy;

    /**
     * 通过构造方法注入具体的策略，如果用Spring，就可以直接使用@Resource来注入了
     */
    public StrategyHandler(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Double getPrice(double standardPrice) {
        double price = strategy.getPrice(standardPrice);
        System.out.println("标准价格为：" + standardPrice);
        return price;
    }
}
