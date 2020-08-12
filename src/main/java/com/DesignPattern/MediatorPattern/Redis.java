package com.DesignPattern.MediatorPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体同事角色：Redis数据库
 */
public class Redis extends Database {
    /**
     * 数据库名称：Redis数据库
     */
    private String name = "Redis";

    /**
     * 使用List集合存储数据 模拟 数据库存储数据
     */
    private List<String> list = new LinkedList<>();

    public Redis(Mediator mediator) {
        super(mediator);
    }

    /**
     * 向本数据库添加数据, 并通过中介者向其它数据库发送数据同步添加的请求
     * @param str
     */
    @Override
    public void add(String str) {
        // 向本数据库添加数据
        addData(str);
        // 通过中介者向其它数据库发送数据同步添加的请求
        getMediator().syncAddData(str, name);
    }

    /**
     * 向本数据库添加数据
     * @param str
     */
    @Override
    public void addData(String str) {
        list.add(str);
    }

    /**
     * 从本数据库移除数据, 并通过中介者向其它数据库发送数据同步移除的消息
     * @param str
     */
    @Override
    public void remove(String str) {
        // 从本数据库移除数据
        removeData(str);
        // 通过中介者向其它数据库发送数据同步移除的请求
        getMediator().syncRemoveData(str, name);
    }

    /**
     * 从本数据库移除数据
     * @param str
     */
    @Override
    public void removeData(String str) {
        list.remove(str);
    }

    /**
     * 显示本数据库中的数据
     */
    @Override
    public void showData() {
        String str = "<"+ name+ "> : " + list.toString();
        System.out.println(str);
    }
}
