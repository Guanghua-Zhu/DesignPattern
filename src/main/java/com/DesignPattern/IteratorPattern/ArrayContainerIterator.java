package com.DesignPattern.IteratorPattern;

/**
 * 具体迭代器角色：数组容器迭代器
 */
public class ArrayContainerIterator implements Iterator{
    /**
     * 被遍历访问的容器
     */
    private ArrayContainer arrayContainer;

    /**
     * 被遍历访问的容器容量
     */
    private int size;

    /**
     * 遍历访问游标
     */
    private Integer cursor;

    public ArrayContainerIterator(ArrayContainer arrayContainer) {
        this.arrayContainer = arrayContainer;
        this.size = arrayContainer.size();
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        if( cursor < size ) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object e = arrayContainer.get(cursor);
        cursor++;
        return e;
    }
}
