package com.acmday.design.pattern.server.facade;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Coffee {

    private String brand;

    public Coffee(String brand){
        this.brand = brand;
    }

    public void prepareCoffee(){
        System.out.println("准备" + brand + "咖啡原料");
    }

    public String getCoffeeName(){
        return brand;
    }
}
