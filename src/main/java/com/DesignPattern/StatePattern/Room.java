package com.DesignPattern.StatePattern;

/**
 * 环境角色: 酒店房间
 */
public class Room {
    /**
     * 房号
     */
    private String roomId;

    /**
     * 房间状态
     */
    private State state;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Room(String roomId) {
        this.roomId = roomId;
        this.state = new FreeState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void book() {
        state.book(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void pay() {
        state.pay(this);
    }

    public void checkout() {
        state.checkout(this);
    }

}
