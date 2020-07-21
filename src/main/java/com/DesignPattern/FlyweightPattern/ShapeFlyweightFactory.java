package com.DesignPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 享元工厂角色： 形状享元对象工厂
 */
public class ShapeFlyweightFactory {
    /**
     * Shape对象的缓存池
     * key: type 形状类型; value: 该类型的形状对象
     */
    private static Map<String, Shape> shapeMap = new HashMap<>();

    /**
     * Shape的工厂, 用于获取Shape
     * @param type 形状类型
     * @return
     */
    public static Shape factory(String type) {
        Shape shape = shapeMap.get(type);
        if( shape==null ) {
            shape = new Shape(type);
            shapeMap.put(type, shape);
        }
        return shape;
    }

    /**
     * Shapes的工厂，用于获取Shapes
     * @param typeSet 类型集合
     * @return
     */
    public static Shapes factory(Set<String> typeSet) {
        Shapes shapes = new Shapes(); // 此行即可说明Shapes对象是不共享的
        for(String type : typeSet) {
            // 但Shapes中的各Shape则是共享的
            Shape shape = factory(type);
            shapes.add(shape);
        }
        return shapes;
    }

}
