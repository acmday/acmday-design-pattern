package com.acmday.design.pattern.server.command;

/**
 * @author acmday.
 * @date 2020/7/22.
 * Receiver：知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者.
 */
public class Barbecuer {

    private String message;

    public Barbecuer(String message) {
        this.message = message;
    }

    public void bake() {
        System.out.println("开始"+message);
    }

    public String getMessage() {
        return message;
    }
}
