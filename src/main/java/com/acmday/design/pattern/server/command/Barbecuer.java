package com.acmday.design.pattern.server.command;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class Barbecuer {

    private String message;

    public Barbecuer(String message) {
        this.message = message;
    }

    public void bake(String message) {
        System.out.println("开始"+message);
    }

    public String getMessage() {
        return message;
    }
}
