package com.DesignPattern.StrategyPattern;

import java.util.Arrays;

/**
 * Strategy Pattern 策略模式 Demo
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("------------------ Test 1 ------------------");
        Integer[] array1 = {3,1,5,11,2,8};
        System.out.println("Before sort: " + Arrays.toString(array1));
        // client 自行指定策略, 这里使用冒泡排序
        arrayUtil.setSortAlgorithm( new BubbleSort() );
        arrayUtil.sortedByAsc( array1 );
        System.out.println("After sort: " + Arrays.toString(array1));

        System.out.println("\n------------------ Test 2 ------------------");
        Double[] array2 = {11.0, -3.2, 1.1, -5.22, 2.73, -9.66};
        System.out.println("Before sort: " + Arrays.toString(array2));
        // client 自行指定策略, 这里使用选择排序
        arrayUtil.setSortAlgorithm( new SelectionSort() );
        arrayUtil.sortedByAsc( array2 );
        System.out.println("After sort: " + Arrays.toString(array2));

        System.out.println("\n------------------ Test 3 ------------------");
        String[] array3 = {"Tim", "Bob", "Tony", "Aaron", "Tom"};
        System.out.println("Before sort: " + Arrays.toString(array3));
        // client 自行指定策略, 这里使用插入排序
        arrayUtil.setSortAlgorithm( new InsertionSort() );
        arrayUtil.sortedByAsc( array3 );
        System.out.println("After sort: " + Arrays.toString(array3));
    }
}
