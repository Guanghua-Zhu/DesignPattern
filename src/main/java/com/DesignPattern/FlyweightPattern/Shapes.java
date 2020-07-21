package com.DesignPattern.FlyweightPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 非共享的具体享元角色(复合享元角色): 多个形状的集合
 */
public class Shapes implements ShapeFlyweight {
    /**
     * 容器中存放各种不同的Shape形状
     */
    private Set<Shape> shapeSet =  new HashSet<>();

    /**
     * 添加形状Shape对象到容器shapeSet中
     */
    public void add(Shape shape) {
        shapeSet.add(shape);
    }

    /**
     * 对容器shapeSet中各Shape形状均设置同一种颜色
     * @param color
     */
    @Override
    public void setExtrinsicState(String color) {
        for(Shape shape : shapeSet) {
            shape.setExtrinsicState(color);
        }
    }

    @Override
    public void getInfo() {
        for(Shape shape : shapeSet ) {
            shape.getInfo();
        }
    }
}
