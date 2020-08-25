package com.DesignPattern.VisitorPattern.demo2;

/**
 * 具体访问者角色: 女人
 */
public class Woman implements People{
    /**
     * 访问商品衣服
     * @param clothes
     */
    @Override
    public void visit(Clothes clothes) {
        System.out.println("女人看衣服关注颜色: " + clothes.getColor());
    }

    /**
     * 访问商品电脑
     * @param clothes
     */
    @Override
    public void visit(Pc pc) {
        System.out.println("女人看电脑关注价格: " + pc.getPrice());
    }
}
