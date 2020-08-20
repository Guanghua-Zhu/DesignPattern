package com.DesignPattern.StatePattern;

/**
 * 抽象状态角色: 酒店房间的状态
 */
public interface State {

    void book(Room room);

    void cancel(Room room);

    void pay(Room room);

    void checkout(Room room);
}
