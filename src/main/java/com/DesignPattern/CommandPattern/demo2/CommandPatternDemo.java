package com.DesignPattern.CommandPattern.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * Command Pattern 命令模式 Demo
 */
public class CommandPatternDemo {
    public static void main(String[] args) {

        // 将各命令与相应的接收者进行组装
        Tv tv = new Tv();
        TurnOnTvCommand turnOnTvCommand = new TurnOnTvCommand();
        turnOnTvCommand.setTv(tv);
        TurnOffTvCommand turnOffTvCommand = new TurnOffTvCommand();
        turnOffTvCommand.setTv(tv);

        Sound sound = new Sound();
        TurnOnSoundCommand turnOnSoundCommand = new TurnOnSoundCommand();
        turnOnSoundCommand.setSound(sound);
        TurnOffSoundCommand turnOffSoundCommand = new TurnOffSoundCommand();
        turnOffSoundCommand.setSound(sound);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Command Pattern 命令模式 Demo");
        // 打开电视
        System.out.println("\n--------------- Test 1: 打开电视 ---------------");
        remoteControl.setCommand( turnOnTvCommand );
        remoteControl.button();

        // 打开音响
        System.out.println("\n--------------- Test 2: 打开音响 ---------------");
        remoteControl.setCommand( turnOnSoundCommand );
        remoteControl.button();

        // 关闭电视
        System.out.println("\n--------------- Test 3: 关闭电视 ---------------");
        remoteControl.setCommand( turnOffTvCommand );
        remoteControl.button();

        // 宏命令: 打开电视、音响
        System.out.println("\n--------------- Test 4: 宏命令: 打开电视、音响 ---------------");
        List<Command> commandList = new LinkedList<>();
        commandList.add(turnOnTvCommand);
        commandList.add(turnOnSoundCommand);
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.setList(commandList);

        remoteControl.setCommand( macroCommand );
        remoteControl.button();

    }
}
