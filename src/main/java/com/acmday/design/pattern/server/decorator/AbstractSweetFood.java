package com.acmday.design.pattern.server.decorator;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public abstract class AbstractSweetFood {

    String description = "AbstractSweetFood";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
