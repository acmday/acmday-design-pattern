package com.acmday.design.pattern.server.state;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public interface State {
    void handle(int roomNumber);
}
