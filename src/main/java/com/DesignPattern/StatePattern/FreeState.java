package com.DesignPattern.StatePattern;

/**
 * 具体状态角色: 空闲状态
 */
public class FreeState implements State {
    @Override
    public void book(Room room) {
        String str = room.getRoomId() + ": 房间预订成功";
        System.out.println(str);
        // 房间状态转换为预订状态
        room.setState( new BookedState() );
    }

    @Override
    public void cancel(Room room) {
        String str = room.getRoomId() + ": 房间为空闲状态, 无需取消预订";
        System.out.println(str);
    }

    @Override
    public void pay(Room room) {
        String str = room.getRoomId() + ": 房间为空闲状态, 无需支付";
        System.out.println(str);
    }

    @Override
    public void checkout(Room room) {
        String str = room.getRoomId() + ": 房间为空闲状态, 无需退房";
        System.out.println(str);
    }
}
