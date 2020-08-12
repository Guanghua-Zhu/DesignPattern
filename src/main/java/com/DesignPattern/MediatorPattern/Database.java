package com.DesignPattern.MediatorPattern;

/**
 * 抽象同事角色：数据库
 */
public abstract class Database {
    /**
     * 中介者
     */
    private Mediator mediator;

    public Database(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    /**
     * 向本数据库添加数据, 并通过中介者向其它数据库发送数据同步添加的请求
     * @param str
     */
    abstract public void add(String str);

    /**
     * 向本数据库添加数据
     * @param str
     */
    abstract public void addData(String str);

    /**
     * 从本数据库移除数据, 并通过中介者向其它数据库发送数据同步移除的请求
     * @param str
     */
    abstract public void remove(String str);

    /**
     * 从本数据库移除数据
     * @param str
     */
    abstract public void removeData(String str);

    /**
     * 显示本数据库中的数据
     */
    abstract public void showData();
}
