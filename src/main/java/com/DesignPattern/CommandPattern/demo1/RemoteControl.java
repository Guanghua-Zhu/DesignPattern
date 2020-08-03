package com.DesignPattern.CommandPattern.demo1;

/**
 * 调用者: 遥控器
 */
public class RemoteControl {
    private Sound sound;
    private Tv tv;

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public void button(int num) {
        switch (num) {
            case 1:
                sound.turnOn();     // 打开音响
                break;
            case 2:
                sound.turnOff();    // 关闭音响
                break;
            case 3:
                tv.turnOn();        // 打开电视
                break;
            case 4:
                tv.turnOff();       // 关闭电视
                break;
            default:
        }
    }
}
