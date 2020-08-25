package com.DesignPattern.VisitorPattern.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 电脑
 */
@AllArgsConstructor     // 提供全参构造器
@NoArgsConstructor      // 提供无参构造器
@Data                   // 提供getter、setter方法
public class Pc implements Goods {
    /**
     * 颜色
     */
    private String color;

    /**
     * 价格
     */
    private Double price;
}
