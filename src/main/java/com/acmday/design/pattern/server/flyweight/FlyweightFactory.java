package com.acmday.design.pattern.server.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public class FlyweightFactory {

    private Map<Character, Flyweight> files = new HashMap<>();

    /**
     * 复合享元工厂方法
     */
    public Flyweight build(List<Character> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for(Character state : compositeState){
            compositeFly.add(state,this.build(state));
        }
        return compositeFly;
    }

    /**
     * 单纯享元工厂方法
     */
    public Flyweight build(Character state) {
        Flyweight fly = files.get(state);
        if(fly == null) {
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }
}
