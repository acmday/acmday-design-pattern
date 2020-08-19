package com.acmday.design.pattern.server.prototype;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle::draw().");
    }
}
