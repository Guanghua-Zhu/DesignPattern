package com.DesignPattern.IteratorPattern;

/**
 * 抽象容器角色
 */
public interface Container {
    /**
     * 获取该容器的迭代器
     * @return
     */
    Iterator iterator();
}
