package com.acmday.design.pattern.server.template;

/**
 * @author acmday.
 * @date 2020/8/17.
 */
public abstract class AbstractCaffeineBeverageWithHook {

    /**
     * 核心。该方法定义了一个算法框架.
     */
    public void prepare(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling water");
    }

    protected void pourInCup(){
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments(){
        return true;
    }
}
