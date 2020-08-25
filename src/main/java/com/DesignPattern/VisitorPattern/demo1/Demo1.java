package com.DesignPattern.VisitorPattern.demo1;

/**
 * Demo 1: 不使用 Visitor Pattern 访问者模式
 */
public class Demo1 {
    public static void main(String[] args) {
        Goods clothes = new Clothes("Green", 22.3);
        Goods pc = new Pc("Black", 3333.33);

        System.out.println("Demo1: 不使用 Visitor Pattern 访问者模式");
        System.out.println("\n-------------- Test 1 --------------");
        People man = new Man();
        man.visit(clothes);
        man.visit(pc);

        System.out.println("\n-------------- Test 2 --------------");
        People woman = new Woman();
        woman.visit(clothes);
        woman.visit(pc);
    }
}
