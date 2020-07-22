package com.acmday.design.pattern.server.command;

import java.util.Objects;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    abstract public void executeCommand();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command command = (Command) o;
        return Objects.equals(receiver, command.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiver);
    }

    public Barbecuer getReceiver() {
        return receiver;
    }
}
