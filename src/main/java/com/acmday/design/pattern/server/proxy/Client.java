package com.acmday.design.pattern.server.proxy;

import java.lang.reflect.Proxy;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Client {

    /**
     * JDK实现动态代理的缺点：仅支持interface代理。
     *
     * 对于没有接口的类，如何实现动态代理呢，这就需要CGLib了。CGLib采用了非常底层的字节码技术，
     * 其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。
     * 但因为采用的是继承，所以不能对final修饰的类进行代理。JDK动态代理与CGLib动态代理均是实现Spring AOP的基础。
     */
    public static void dynamicProxy() {

        BuyHouse buyHouse = new BuyHouseImpl();

        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(
                BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxyHandler(buyHouse)
        );
        proxyBuyHouse.buyHosue();
    }

    public static void staticProxy() {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
