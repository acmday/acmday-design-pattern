package com.acmday.design.pattern.server.service.impl;

import com.acmday.design.pattern.server.service.Observer;
import com.acmday.design.pattern.server.service.Subject;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acmday.
 * @date 2020/7/18.
 */
public class CctvNewsSubject implements Subject {

    private List<Observer> observers;

    public CctvNewsSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        if(CollectionUtils.isEmpty(observers)) {
            System.out.println("该Observer没有订阅新闻，移除失败！");
            return;
        }
        observers.remove(ob);
    }

    @Override
    public void notifyObserver(String message) {
        observers.forEach(elem -> elem.handleMessage(message));
    }
}
