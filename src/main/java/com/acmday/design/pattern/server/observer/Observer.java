package com.acmday.design.pattern.server.observer;


/**
 * @author acmday.
 * @date 2020/7/17.
 * 观察者
 */

public interface Observer {
    /**
     * 处理消息
     */
    void handleMessage(String message);
}
