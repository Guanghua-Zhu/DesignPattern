package com.DesignPattern.StrategyPattern;

/**
 * 具体策略角色: 选择排序
 */
public class SelectionSort implements SortAlgorithm {

    @Override
    public <T extends Comparable> void sort(T[] array) {
        int size = array.length;
        for(int i=0; i<size-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<size; j++) {
                if( array[minIndex].compareTo(array[j])>0 ) {
                    minIndex = j;
                }
            }
            if( minIndex != i ) {
                T temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}