package com.acmday.design.pattern.server.observer;

/**
 * @author acmday.
 * @date 2020/7/17.
 * 主题接口。observer会订阅主题。
 */

public interface Subject {
    /**
     * 添加观察者
     * @param ob
     */
    void add(Observer ob);

    /**
     * 移除观察者
     * @param ob
     */
    void remove(Observer ob);

    /**
     * 通知观察者
     */
    void notifyObserver(String message);
}
