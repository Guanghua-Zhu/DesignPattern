package com.DesignPattern.BuilderPattern.demo2;

/**
 * Builder Patter 建造者模式 Demo
 */
public class BuilderPatterDemo {

    public static void main(String[] args) {
        Phone P40Pro = Phone.builder()
                .brand("华为")
                .os("鸿蒙")
                .ramSize(12)
                .price(9999.99)
                .build();

        System.out.println(P40Pro);
    }
}
