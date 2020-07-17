package com.DesignPattern.CompositePattern.transparencyDemo;

import java.util.LinkedList;
import java.util.List;

/**
 * 树枝组件: 文件夹
 */
public class Folder extends FileSystem {
    private List<FileSystem> list = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    /**
     * 向文件夹中添加
     * @param fileSystem
     */
    @Override
    public void add(FileSystem fileSystem) {
        list.add(fileSystem);
    }

    /**
     * 从文件夹中移除
     * @param fileSystem
     */
    @Override
    public void remove(FileSystem fileSystem) {
        list.remove(fileSystem);
    }

    /**
     * 获取该文件夹下的全部子节点(文件/文件夹)
     * @return
     */
    @Override
    public List<FileSystem> getChildren() {
        return list;
    }
}
