package com.DesignPattern.FlyweightPattern;

import java.util.*;

/**
 * Flyweight Pattern 享元模式 Demo
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        System.out.println("--------------- Test 1: 可共享的享元对象Shape测试 ---------------");

        // client需要一个红色的圆形
        ShapeFlyweight redCircle = ShapeFlyweightFactory.factory("圆形");
        redCircle.setExtrinsicState( "红色" );   // 设置外部状态(颜色)为红色
        redCircle.getInfo();

        // client需要一个蓝色的圆形
        ShapeFlyweight blueCircle = ShapeFlyweightFactory.factory("圆形");
        blueCircle.setExtrinsicState( "蓝色" );   // 设置外部状态(颜色)为蓝色
        blueCircle.getInfo();

        // client需要一个绿色的矩形
        ShapeFlyweight greenRectangle = ShapeFlyweightFactory.factory("矩形");
        greenRectangle.setExtrinsicState( "绿色" );   // 设置外部状态(颜色)为蓝色
        greenRectangle.getInfo();

        // client需要一个黑色的矩形
        ShapeFlyweight blackRectangle = ShapeFlyweightFactory.factory("矩形");
        blackRectangle.setExtrinsicState( "黑色" );   // 设置外部状态(颜色)为黑色
        blackRectangle.getInfo();

        System.out.println( "红色圆形 与 蓝色圆形 是否为同一个对象: " + (redCircle==blueCircle) );
        System.out.println( "绿色矩形 与 黑色矩形 是否为同一个对象: " + (greenRectangle==blackRectangle) );


        System.out.println("--------------- Test 2: 不可共享的享元对象Shapes测试 ---------------");

        // client需要一个黄色的多边形集合
        Set<String> typeSet1 = new HashSet<>();
        typeSet1.addAll( Arrays.asList("三角形", "正方形", "长方形") );
        ShapeFlyweight shapes1 = ShapeFlyweightFactory.factory( typeSet1 );
        shapes1.setExtrinsicState("黄色");
        shapes1.getInfo();

        // client需要一个白色的形状集合
        Set<String> typeSet2 = new HashSet<>();
        typeSet2.addAll( Arrays.asList("圆形", "椭圆形","三角形") );
        ShapeFlyweight shapes2 = ShapeFlyweightFactory.factory( typeSet2 );
        shapes2.setExtrinsicState("白色");
        shapes2.getInfo();

    }
}
