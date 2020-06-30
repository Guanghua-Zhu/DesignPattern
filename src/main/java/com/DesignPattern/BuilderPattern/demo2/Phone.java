package com.DesignPattern.BuilderPattern.demo2;


import lombok.*;

/**
 * 手机
 */
@ToString  // 可自动生成toString方法
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

    /**
     * 提供一个静态方法以方便创建一个Phone建造者实例
     * @return
     */
    public static Phone.PhoneBuilder builder() {
        return new Phone.PhoneBuilder();
    }

    /**
     * 提供一个Phone的全参构造器以供建造者Builder来建造Phone实例
     * @param brand
     * @param os
     * @param ramSize
     * @param price
     */
    public Phone(String brand, String os, Integer ramSize, Double price) {
        this.brand = brand;
        this.os = os;
        this.ramSize = ramSize;
        this.price = price;
    }


    /**
     * 静态内部类: Phone Builder 建造者
     */
    public static class PhoneBuilder {

        private String brand;

        private String os;

        private Integer ramSize;

        private Double price;

        /**
         * Builder 建造者构造器
         */
        public PhoneBuilder() {
        }

        public Phone.PhoneBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Phone.PhoneBuilder os(String os) {
            this.os = os;
            return this;
        }

        public Phone.PhoneBuilder ramSize(Integer ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Phone.PhoneBuilder price(Double price) {
            this.price = price;
            return this;
        }

        /**
         * 建造者通过 Phone的全参构造器 来构造 Phone 实例
         * @return
         */
        public Phone build() {
            return new Phone(brand, os, ramSize, price);
        }
    }
}
