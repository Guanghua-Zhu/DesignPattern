package com.DesignPattern.StrategyPattern;

/**
 * 抽象策略角色: 排序算法
 */
public interface SortAlgorithm {
    /**
     * 对数组排序
     * @param array
     * @param <T>
     * @apiNote 按升序排序
     */
    <T extends Comparable> void sort(T[] array);
}
