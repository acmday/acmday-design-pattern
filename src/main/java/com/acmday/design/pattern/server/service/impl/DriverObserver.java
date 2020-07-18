package com.acmday.design.pattern.server.service.impl;

import com.acmday.design.pattern.server.service.Observer;

/**
 * @author acmday.
 * @date 2020/7/18.
 */
public class DriverObserver implements Observer {
    @Override
    public void handleMessage(String message) {
        System.out.println("司机收到消息：" + message);
    }
}
