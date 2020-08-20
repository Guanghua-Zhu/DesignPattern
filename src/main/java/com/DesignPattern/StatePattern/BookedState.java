package com.DesignPattern.StatePattern;

/**
 * 具体状态角色: 预订状态
 */
public class BookedState implements State {
    @Override
    public void book(Room room) {
        String str = room.getRoomId() + ": 房间已预订, 不可重复预订";
        System.out.println(str);
    }

    @Override
    public void cancel(Room room) {
        String str = room.getRoomId() + ": 房间取消预订成功";
        System.out.println(str);
        // 房间状态转换为空闲状态
        room.setState( new FreeState() );
    }

    @Override
    public void pay(Room room) {
        String str = room.getRoomId() + ": 房间支付成功";
        System.out.println(str);
        // 房间状态转换为入住状态
        room.setState( new CheckinState() );
    }

    @Override
    public void checkout(Room room) {
        String str = room.getRoomId() + ": 房间为预订状态, 无需退房";
        System.out.println(str);
    }
}
