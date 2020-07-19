package com.acmday.design.pattern.server.observer;

/**
 * @author acmday.
 * @date 2020/7/18.
 */
public class TeacherObserver implements Observer {

    @Override
    public void handleMessage(String message) {
        System.out.println("老师收到消息：" + message);
    }
}
