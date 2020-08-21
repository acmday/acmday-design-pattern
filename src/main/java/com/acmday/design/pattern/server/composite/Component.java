package com.acmday.design.pattern.server.composite;

/**
 * @author acmday.
 * @date 2020/8/21.
 */
public abstract class Component {
    public String getName() {
        throw new UnsupportedOperationException("该操作暂不支持！");
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("该操作暂不支持！");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("该操作暂不支持！");
    }

    public void print() {
        throw new UnsupportedOperationException("该操作暂不支持！");
    }

    public String getContent() {
        throw new UnsupportedOperationException("该操作暂不支持！");
    }
}
