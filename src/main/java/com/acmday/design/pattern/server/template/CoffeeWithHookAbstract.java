package com.acmday.design.pattern.server.template;

/**
 * @author acmday.
 * @date 2020/8/17.
 */
public class CoffeeWithHookAbstract extends AbstractCaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.print("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments(){
        return makeDecision();
    }

    private boolean makeDecision() {
        return true;
    }
}
