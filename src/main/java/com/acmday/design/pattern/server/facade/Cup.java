package com.acmday.design.pattern.server.facade;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class Cup {

    private CupType type;

    public Cup(CupType type) {
        this.type = type;
    }

    public void PrepareCup() {
        System.out.println("准备杯子:" + type);
    }

    public enum CupType {
        CoffeeCup,
        VacuumCup,
        masturbationCup
    }
}
