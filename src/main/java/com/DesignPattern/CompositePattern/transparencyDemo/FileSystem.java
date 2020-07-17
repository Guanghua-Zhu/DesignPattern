package com.DesignPattern.CompositePattern.transparencyDemo;

import java.util.List;

/**
 * 抽象组件角色: 文件系统
 */
public abstract class FileSystem {
    private String name;

    public FileSystem(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("[NAME]: " + name);
    }

    /**
     * 向文件夹中添加
     * @param fileSystem
     */
    abstract public void add(FileSystem fileSystem);

    /**
     * 从文件夹中移除
     * @param fileSystem
     */
    abstract public void remove(FileSystem fileSystem);

    /**
     * 获取该文件夹下的全部子节点(文件/文件夹)
     * @return
     */
    abstract public List<FileSystem> getChildren();
}
