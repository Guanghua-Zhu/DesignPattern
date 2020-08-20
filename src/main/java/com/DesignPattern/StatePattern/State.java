package com.DesignPattern.StatePattern;

/**
 * 抽象状态角色: 酒店房间的状态
 */
public interface State {

    /**
     * 预订
     * @param room
     */
    void book(Room room);

    /**
     * 取消预订
     * @param room
     */
    void cancel(Room room);

    /**
     * 支付
     * @param room
     */
    void pay(Room room);

    /**
     * 退房
     * @param room
     */
    void checkout(Room room);
}
