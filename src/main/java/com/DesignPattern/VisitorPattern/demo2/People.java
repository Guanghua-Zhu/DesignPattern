package com.DesignPattern.VisitorPattern.demo2;

/**
 * 抽象访问者角色: 人
 */
public interface People {
    /**
     * 访问商品衣服
     * @param clothes
     */
    void visit(Clothes clothes);

    /**
     * 访问商品电脑
     * @param pc
     */
    void visit(Pc pc);
}
