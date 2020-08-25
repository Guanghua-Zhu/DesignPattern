package com.DesignPattern.VisitorPattern.demo1;

/**
 * 人
 */
public interface People {
    /**
     * 访问商品
     * @param goods
     */
    void visit(Goods goods);
}
