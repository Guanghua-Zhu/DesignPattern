package com.DesignPattern.IteratorPattern;

/**
 * 抽象迭代器角色
 */
public interface Iterator {
    /**
     * 集合中是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取集合中的下一个元素
     * @return
     */
    Object next();
}
