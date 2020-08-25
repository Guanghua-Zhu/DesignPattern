package com.DesignPattern.VisitorPattern.demo2;

/**
 * Demo 2: 使用 Visitor Pattern 访问者模式
 */
public class Demo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Goods clothes = new Clothes("Red", 124.5);
        Goods pc = new Pc("White", 9999.99);

        shop.add(clothes);
        shop.add(pc);

        System.out.println("Demo 2: 使用 Visitor Pattern 访问者模式");
        System.out.println("\n-------------- Test 1 --------------");
        People man = new Man();
        clothes.accept(man);
        pc.accept(man);

        System.out.println("\n-------------- Test 2 --------------");
        People woman = new Woman();
        clothes.accept(woman);
        pc.accept(woman);

        System.out.println("\n-------------- Test 3 --------------");
        shop.viewAllGoods(man);
    }
}