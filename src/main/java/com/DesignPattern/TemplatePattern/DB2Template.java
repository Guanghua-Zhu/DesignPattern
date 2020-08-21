package com.DesignPattern.TemplatePattern;

/**
 * 具体模板角色: DB2数据库模板
 */
public class DB2Template extends DatabaseTemplate {
    @Override
    public void connectionDatabase() {
        System.out.println("连接 DB2 数据库");
    }

    @Override
    public void openDatabase() {
        System.out.println("打开 DB2 数据库");
    }

    @Override
    public void execSql(String sql) {
        System.out.println("执行SQL语句: " + sql);
    }

    @Override
    public void closeDatabase() {
        System.out.println("关闭 DB2 数据库");
    }
}