package com.acmday.design.pattern.server.state;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class RoomContext {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(int roomNumber) {
        state.handle(roomNumber);
    }
}
