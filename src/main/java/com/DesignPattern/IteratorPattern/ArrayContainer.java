package com.DesignPattern.IteratorPattern;

/**
 * 具体容器角色：数组容器
 */
public class ArrayContainer implements Container {

    private Object[] array;

    private int index;

    /**
     * 构建指定大小的数组容器
     * @param size
     */
    public ArrayContainer(int size) {
        array = new Object[size];
        index = 0;
    }

    /**
     * 向容器中添加元素
     * @param e
     * @return true: 添加成功; false: 容器已满, 添加失败
     */
    public boolean add(Object e) {
        if( index < array.length ) {
            array[index] = e;
            index++;
            return true;
        }
        return false;
    }

    /**
     * 通过下标获取容器中的元素
     * @param index
     * @return
     */
    public Object get(int index) {
        if( index < array.length ) {
            return array[index];
        }
        return null;
    }

    /**
     * 获取容器容量
     * @return
     */
    public int size() {
        return array.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayContainerIterator( this );
    }
}
