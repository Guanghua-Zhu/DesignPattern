package com.DesignPattern.IteratorPattern;

/**
 * Iterator Pattern 迭代器模式 Demo
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        // 构造容器
        ArrayContainer arrayContainer = new ArrayContainer(5);
        // 向容器中添加元素
        arrayContainer.add("Aaron");
        arrayContainer.add("Bob");
        arrayContainer.add("Amy");
        arrayContainer.add("Tony");
        arrayContainer.add("David");

        // 获取容器的迭代器
        Iterator iterator = arrayContainer.iterator();
        // 利用迭代器遍历访问容器中的元素
        while( iterator.hasNext() ) {
            Object e = iterator.next();
            System.out.println("Element: " + e);
        }
    }
}
