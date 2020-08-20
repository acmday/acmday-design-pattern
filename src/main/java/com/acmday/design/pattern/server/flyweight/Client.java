package com.acmday.design.pattern.server.flyweight;

import java.util.Arrays;
import java.util.List;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public class Client {

    public static void compositFlyWeight() {
        List<Character> compositeState = Arrays.asList('a','b','c', 'a', 'b');

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly = flyFactory.build(compositeState);
        compositeFly.operation("color changed, color=blue!");
    }

    public static void pureFlyWeight() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.build('a');
        fly.operation("width=5 color=green");

        fly = factory.build('b');
        fly.operation("width=10 color=yellow");

        fly = factory.build('c');
        fly.operation("width=7 color=red");
    }
}
