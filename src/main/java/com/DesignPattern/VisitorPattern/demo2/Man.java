package com.DesignPattern.VisitorPattern.demo2;

/**
 * 具体访问者角色: 男人
 */
public class Man implements People{
    /**
     * 访问商品衣服
     * @param clothes
     */
    @Override
    public void visit(Clothes clothes) {
        System.out.println("男人看衣服关注价格: " + clothes.getPrice());
    }

    /**
     * 访问商品电脑
     * @param clothes
     */
    @Override
    public void visit(Pc pc) {
        System.out.println("男人看电脑关注外观: " + pc.getColor());
    }
}
