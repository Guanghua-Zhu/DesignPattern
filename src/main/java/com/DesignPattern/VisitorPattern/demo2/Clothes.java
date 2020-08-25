package com.DesignPattern.VisitorPattern.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 具体元素角色: 衣服
 */
@AllArgsConstructor     // 提供全参构造器
@NoArgsConstructor      // 提供无参构造器
@Data                   // 提供getter、setter方法
public class Clothes implements Goods {
    /**
     * 颜色
     */
    private String color;

    /**
     * 价格
     */
    private Double price;

    /**
     * 接受一个访问者以对该元素进行访问
     * @param people
     */
    @Override
    public void accept(People people) {
        people.visit(this);
    }
}
