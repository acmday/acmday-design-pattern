package com.acmday.design.pattern.server.chainOfResponsibility;

import com.acmday.design.pattern.server.chainOfResponsibility.ILeave;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class Leave implements ILeave {

    private String name;
    private int number;
    private String content;

    public Leave(String name, int number, String content) {
        this.name = name;
        this.number = number;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getContent() {
        return content;
    }
}
