package com.DesignPattern.TemplatePattern;

/**
 * 抽象模板角色: 数据库模板
 */
public abstract class DatabaseTemplate {
    /**
     * 通过SQL语句来使用数据库
     * @param sql
     * @apiNote
     *      1. 其是一个模板方法, 用于规定各方法的调用顺序
     *      2. 使用final进行修饰, 保证子类无法重写该方法
     */
    public final void useDatabase(String sql) {
        connectionDatabase();
        openDatabase();
        execSql(sql);
        closeDatabase();
    }

    /**
     * 连接数据库
     */
    public abstract void connectionDatabase();

    /**
     * 打开数据库
     */
    public abstract void openDatabase();

    /**
     * 执行SQL语句
     * @param sql
     */
    public abstract void execSql(String sql);

    /**
     * 关闭数据库
     */
    public abstract void closeDatabase();
}
