package com.DesignPattern.CommandPattern.demo1;

/**
 * 传统的未使用命令模式的Demo
 */
public class Demo1 {
    public static void main(String[] args) {
        Sound sound = new Sound();
        Tv tv = new Tv();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setSound(sound);
        remoteControl.setTv(tv);

        System.out.println("传统的未使用命令模式的Demo");
        // 通过遥控器发出命令
        // 打开电视
        System.out.println("\n--------------- Test 1: 打开电视 ---------------");
        remoteControl.button(3);

        // 打开音响
        System.out.println("\n--------------- Test 2: 打开音响 ---------------");
        remoteControl.button(1);

        // 关闭电视
        System.out.println("\n--------------- Test 3: 关闭电视 ---------------");
        remoteControl.button(4);
    }
}
