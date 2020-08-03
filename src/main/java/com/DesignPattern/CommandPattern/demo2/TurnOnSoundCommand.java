package com.DesignPattern.CommandPattern.demo2;

/**
 * 具体命令角色: 打开音响命令
 */
public class TurnOnSoundCommand implements Command {
    private Sound sound;

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.turnOn();
    }
}
