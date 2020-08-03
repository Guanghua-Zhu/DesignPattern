package com.DesignPattern.CommandPattern.demo2;


/**
 * 调用者: 遥控器
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void button() {
        command.execute();
    }
}

