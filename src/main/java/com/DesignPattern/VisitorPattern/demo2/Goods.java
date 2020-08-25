package com.DesignPattern.VisitorPattern.demo2;

/**
 * 抽象元素角色: 商品
 */
public interface Goods {

    /**
     * 接受一个访问者以对该元素进行访问
     * @param people
     */
    void accept(People people);
}
