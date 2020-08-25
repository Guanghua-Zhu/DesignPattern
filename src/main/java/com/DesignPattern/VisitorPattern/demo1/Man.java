package com.DesignPattern.VisitorPattern.demo1;

/**
 * 男人
 */
public class Man implements People {
    @Override
    public void visit(Goods goods) {
        if( goods instanceof Clothes ) {
            Clothes clothes = (Clothes)goods;
            System.out.println("男人看衣服关注价格: " + clothes.getPrice());
        }else if( goods instanceof Pc ) {
            Pc pc = (Pc)goods;
            System.out.println("男人看电脑关注外观: " + pc.getColor());
        }
    }
}
