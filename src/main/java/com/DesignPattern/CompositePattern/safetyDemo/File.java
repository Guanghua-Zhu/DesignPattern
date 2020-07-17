package com.DesignPattern.CompositePattern.safetyDemo;

/**
 * 叶子组件: 文件
 */
public class File extends FileSystem {
    public File(String name) {
        super(name);
    }
}
