package com.acmday.design.pattern.server.adapter;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
public class PowerAdapter extends PowerAdaptee implements PowerTarget {
    @Override
    public int output5v() {
        return output220v()/4;
    }
}
