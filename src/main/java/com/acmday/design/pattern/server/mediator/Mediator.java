package com.acmday.design.pattern.server.mediator;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public interface Mediator {
    /**
     * 发送信息
     * @param message
     * @param sender
     */
    void send(String message, AbstractPeople sender);

    /**
     * 返回信息
     * @param message
     * @param responser
     */
    void response(String message, AbstractPeople responser);
}
