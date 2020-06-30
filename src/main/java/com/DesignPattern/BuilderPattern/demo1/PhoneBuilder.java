package com.DesignPattern.BuilderPattern.demo1;

/**
 * 手机建造者的接口
 */
public interface PhoneBuilder {

    /**
     * 设置品牌
     */
    void setBrand();

    /**
     * 设置操作系统
     */
    void setOs();

    /**
     * 设置内存大小
     */
    void setRamSize();

    /**
     * 设置售价
     */
    void setPrice();

    /**
     * 获取 Phone 实例
     * @return
     */
    Phone getPhone();
}
