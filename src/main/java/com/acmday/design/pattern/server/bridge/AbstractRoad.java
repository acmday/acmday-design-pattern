package com.acmday.design.pattern.server.bridge;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public abstract class AbstractRoad {

    protected AbstractVehicle vehicle;

    public AbstractRoad(AbstractVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();
}
