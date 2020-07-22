package com.acmday.design.pattern.server.command;

import java.util.HashSet;
import java.util.Set;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class Waiter {

    private Set<Command> orders = new HashSet<>();

    public void addOrder(Command command) {
        orders.add(command);
        System.out.println("增加订单：" + command.getReceiver().getMessage());
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
    }

    public void notifyMessage() {
        for(Command order: orders) {
            order.executeCommand();
        }
    }
}
