package com.acmday.design.pattern.server.prototype;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class Circle extends AbstractShape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw().");
    }
}
