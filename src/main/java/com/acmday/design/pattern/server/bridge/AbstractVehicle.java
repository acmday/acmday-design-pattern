package com.acmday.design.pattern.server.bridge;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public abstract class AbstractVehicle {
    protected String vehicleName;
    public String getVehicleName() {
        return vehicleName;
    }
    public abstract void drive();
}
