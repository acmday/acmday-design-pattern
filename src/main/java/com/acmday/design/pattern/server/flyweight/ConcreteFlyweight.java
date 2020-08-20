package com.acmday.design.pattern.server.flyweight;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 内蕴状态
     */
    private Character intrinsicState ;

    public ConcreteFlyweight(Character character) {
        this.intrinsicState = character;
    }

    /**
     * @param state 外蕴状态
     */
    @Override
    public void operation(String state) {
        System.out.println("IntrinsicState：" + intrinsicState);
        System.out.println("ExtrinsicState：" + state);
    }
}
