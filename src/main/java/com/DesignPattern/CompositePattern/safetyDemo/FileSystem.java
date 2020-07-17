package com.DesignPattern.CompositePattern.safetyDemo;

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
}
