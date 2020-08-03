package com.DesignPattern.CommandPattern.demo2;

/**
 * 具体命令角色: 关闭电视命令
 */
public class TurnOffTvCommand implements Command {
    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
