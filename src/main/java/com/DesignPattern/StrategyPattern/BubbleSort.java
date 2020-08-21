package com.DesignPattern.StrategyPattern;

/**
 * 具体策略角色: 冒泡排序
 */
public class BubbleSort implements SortAlgorithm {

    @Override
    public <T extends Comparable> void sort(T[] array) {
        int size = array.length;
        for( int i=0; i<size-1; i++ ) {
            for(int j=0; j<size-i-1; j++) {
                if( array[j].compareTo(array[j+1]) > 0 ) {
                    T temp =  array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
