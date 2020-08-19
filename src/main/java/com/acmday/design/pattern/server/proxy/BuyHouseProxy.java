package com.acmday.design.pattern.server.proxy;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class BuyHouseProxy implements BuyHouse{

    private BuyHouse buyHouse;

    @Override
    public void buyHosue() {
        System.out.println("准备买");
        buyHouse.buyHosue();
        System.out.println("买完之后");
    }

    public BuyHouseProxy(final BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }
}
