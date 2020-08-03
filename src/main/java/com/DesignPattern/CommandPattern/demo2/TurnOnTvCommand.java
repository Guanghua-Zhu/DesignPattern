package com.DesignPattern.CommandPattern.demo2;

/**
 * 具体命令角色: 打开电视命令
 */
public class TurnOnTvCommand implements Command {
    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
