package com.acmday.design.pattern.server.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public class ConcreteCompositeFlyweight implements Flyweight{

    private Map<Character,Flyweight> files = new HashMap<>();

    public void add(Character key , Flyweight fly){
        files.put(key,fly);
    }

    @Override
    public void operation(String state) {
        for(Object o : files.values()){
            ((Flyweight)o).operation(state);
        }
    }
}
