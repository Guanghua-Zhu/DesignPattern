package com.DesignPattern.TemplatePattern;

/**
 * 具体模板角色: Oracle数据库模板
 */
public class OracleTemplate extends DatabaseTemplate {
    @Override
    public void connectionDatabase() {
        System.out.println("连接 Oracle 数据库");
    }

    @Override
    public void openDatabase() {
        System.out.println("打开 Oracle 数据库");
    }

    @Override
    public void execSql(String sql) {
        System.out.println("执行SQL语句: " + sql);
    }

    @Override
    public void closeDatabase() {
        System.out.println("关闭 Oracle 数据库");
    }
}