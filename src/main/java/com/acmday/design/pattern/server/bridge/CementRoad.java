package com.acmday.design.pattern.server.bridge;

/**
 * @author acmday.
 * @date 2020/8/20.
 */
public class CementRoad extends AbstractRoad {

    public CementRoad(AbstractVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        System.out.println(vehicle.getVehicleName() + "跑在水泥路上！");
    }
}
