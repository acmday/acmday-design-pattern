package com.acmday.design.pattern.server.service.manage;

import com.acmday.design.pattern.server.strategy.IStrategy;
import com.acmday.design.pattern.server.strategy.StrategyHandler;

/**
 * @author acmday.
 * @date 2020/7/20.
 */
public class ManageService {

    private static final double STANDARD_PRICE = 1000;

    public static Double getDiscount(IStrategy strategy){
        StrategyHandler handler = new StrategyHandler(strategy);
        return handler.getPrice(STANDARD_PRICE);
    }
}
