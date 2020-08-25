package com.DesignPattern.VisitorPattern.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * 对象结构角色(该角色是可选的, 用于管理具体元素对象): 商店
 */
public class Shop {
    private List<Goods> list = new LinkedList<>();

    /**
     * 添加商品
     * @param goods
     */
    public void add(Goods goods) {
        list.add(goods);
    }

    /**
     * 接受一个访问者以对其所管理的元素依次遍历访问
     * @param people
     */
    public void viewAllGoods(People people) {
        for(Goods goods : list ) {
            goods.accept(people);
        }
    }

}
