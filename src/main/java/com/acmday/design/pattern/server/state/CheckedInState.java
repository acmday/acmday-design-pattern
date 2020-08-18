package com.acmday.design.pattern.server.state;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class CheckedInState implements State {
    @Override
    public void handle(int roomNumber) {
        System.out.println(roomNumber + "号房间已入住！");
    }
}
