package com.acmday.design.pattern.server.prototype;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class Square extends AbstractShape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square::draw().");
    }
}
