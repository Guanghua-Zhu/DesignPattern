package com.DesignPattern.MediatorPattern;

/**
 * 抽象中介者角色
 */
public abstract class Mediator {

    /**
     * 同步添加数据
     * @param str 需同步的数据
     * @param name 请求者
     */
    abstract void syncAddData(String str, String name);

    /**
     * 同步删除数据
     * @param str 需同步的数据
     * @param name 请求者
     */
    abstract void syncRemoveData(String str, String name);
}
