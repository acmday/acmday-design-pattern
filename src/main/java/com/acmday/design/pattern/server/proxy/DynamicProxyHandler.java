package com.acmday.design.pattern.server.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备买");
        Object result = method.invoke(object, args);
        System.out.println("买完之后");
        return result;
    }
}
