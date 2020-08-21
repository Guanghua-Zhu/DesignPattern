package com.DesignPattern.TemplatePattern;

/**
 * Template Pattern 模板模式 Demo
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        System.out.println("----------------- Test 1 -----------------");
        MySQLTemplate mySQLTemplate = new MySQLTemplate();
        String sql1 = "drop table user_token";
        mySQLTemplate.useDatabase(sql1);

        System.out.println("\n----------------- Test 2 -----------------");
        DB2Template db2Template = new DB2Template();
        String sql2 = "select * from user_info";
        db2Template.useDatabase(sql2);

        System.out.println("\n----------------- Test 3 -----------------");
        OracleTemplate oracleTemplate = new OracleTemplate();
        String sql3 = "select * from system_log";
        oracleTemplate.useDatabase(sql3);
    }
}
