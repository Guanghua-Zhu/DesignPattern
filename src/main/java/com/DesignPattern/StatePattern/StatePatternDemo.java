package com.DesignPattern.StatePattern;

/**
 * State Patten 状态模式 Demo
 */
public class StatePatternDemo {
    public static void main(String[] args) {

        Room ruJia302 = new Room("如家302");

        System.out.println("---------------- Test 1 ----------------");
        ruJia302.book();
        ruJia302.cancel();
        ruJia302.book();
        ruJia302.pay();
        ruJia302.checkout();

        System.out.println("\n---------------- Test 2 ----------------");
        ruJia302.pay();
        ruJia302.book();
        ruJia302.book();
        ruJia302.pay();
        ruJia302.cancel();
        ruJia302.book();
        ruJia302.checkout();
    }
}
