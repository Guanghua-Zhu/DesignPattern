package com.DesignPattern.StatePattern;

/**
 * 具体状态角色: 入住状态
 */
public class CheckinState implements State {
    @Override
    public void book(Room room) {
        String str = room.getRoomId() + ": 房间为入住状态, 无法预定";
        System.out.println(str);
    }

    @Override
    public void cancel(Room room) {
        String str = room.getRoomId() + ": 房间为入住状态, 无法取消预定";
        System.out.println(str);
    }

    @Override
    public void pay(Room room) {
        String str = room.getRoomId() + ": 房间为入住状态, 无需重复支付";
        System.out.println(str);
    }

    @Override
    public void checkout(Room room) {
        String str = room.getRoomId() + ": 房间退房成功";
        System.out.println(str);
        // 房间状态转换为空闲状态
        room.setState( new FreeState() );
    }
}
