package com.acmday.design.pattern.server.mediator;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public abstract class AbstractPeople {

    protected Mediator mediator;

    public abstract void send(String message);

    public abstract void response(String messsage);

    public AbstractPeople(Mediator mediator) {
        this.mediator = mediator;
    }
}
