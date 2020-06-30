package com.DesignPattern.BuilderPattern.demo1;


import lombok.Data;

/**
 * 手机
 */
@Data   // 可自动生成get、list、toString方法
public class Phone {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 内存大小, Unit: GB
     */
    private Integer ramSize;

    /**
     * 售价
     */
    private Double price;
}
