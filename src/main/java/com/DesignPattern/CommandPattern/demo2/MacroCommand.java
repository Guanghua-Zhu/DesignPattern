package com.DesignPattern.CommandPattern.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体命令角色: 宏命令
 */
public class MacroCommand implements Command {
    private List<Command> list = new LinkedList<>();

    /**
     * 设置命令集合
     * @param commandList
     */
    public void setList(List<Command> commandList) {
        list.clear();
        list.addAll(commandList);
    }

    /**
     * 执行命令集合中的全部命令
     */
    @Override
    public void execute() {
        for(Command command : list) {
            command.execute();
        }
    }
}
