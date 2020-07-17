package com.DesignPattern.CompositePattern.transparencyDemo;

import java.util.List;

/**
 * 叶子组件: 文件
 */
public class File extends FileSystem {
    public File(String name) {
        super(name);
    }

    @Override
    public void add(FileSystem fileSystem) {
        throw new UnsupportedOperationException("不支持的操作");
    }

    @Override
    public void remove(FileSystem fileSystem) {
        throw new UnsupportedOperationException("不支持的操作");
    }

    @Override
    public List<FileSystem> getChildren() {
        throw new UnsupportedOperationException("不支持的操作");
    }
}
