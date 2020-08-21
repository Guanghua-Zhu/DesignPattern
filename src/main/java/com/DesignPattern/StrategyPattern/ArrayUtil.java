package com.DesignPattern.StrategyPattern;

/**
 * 环境角色: 数组排序工具
 */
public class ArrayUtil {
    /**
     * 排序算法
     */
    private SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * 对数组升序排列
     * @param array
     * @param <T>
     * @return
     */
    public <T extends Comparable> void sortedByAsc(T[] array) {
        if(array==null || array.length==0) {
            return;
        }
        sortAlgorithm.sort(array);
    }

}
