package com.DesignPattern.VisitorPattern.demo1;

/**
 * 女人
 */
public class Woman implements People {
    @Override
    public void visit(Goods goods) {
        if( goods instanceof Clothes ) {
            Clothes clothes = (Clothes)goods;
            System.out.println("女人看衣服关注外观: " + clothes.getColor());
        }else if( goods instanceof Pc ) {
            Pc pc = (Pc)goods;
            System.out.println("女人看电脑关注价格: " + pc.getPrice());
        }
    }
}
