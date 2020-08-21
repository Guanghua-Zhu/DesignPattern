package com.DesignPattern.StrategyPattern;

/**
 * 具体策略角色: 插入排序
 */
public class InsertionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable> void sort(T[] array) {
        int size = array.length;
        for(int i=1; i<size; i++) {
            T temp = array[i];
            int j = i-1;
            for( ; j>=0 && array[j].compareTo(temp)>0; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }
}
