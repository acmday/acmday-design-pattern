package com.acmday.design.pattern.server.adapter;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance!");
    }
}
