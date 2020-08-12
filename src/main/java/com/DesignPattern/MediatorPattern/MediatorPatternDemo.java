package com.DesignPattern.MediatorPattern;

/**
 * Mediator Pattern 中介者模式 Demo
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        // 构造数据同步中介者
        DataSyncMediator dataSyncMediator = new DataSyncMediator();

        // 构造各数据库, 且各数据库只需"知道"中介者
        MySQL mySQL = new MySQL(dataSyncMediator);
        Redis redis = new Redis(dataSyncMediator);
        ElasticSearch elasticSearch = new ElasticSearch(dataSyncMediator);

        // 中介者需要"知道"全部数据库
        dataSyncMediator.setMySQL( mySQL );
        dataSyncMediator.setReis( redis );
        dataSyncMediator.setElasticSearch( elasticSearch );

        System.out.println("--------------- Test 1: MySQL添加数据: Aaron ---------------");
        mySQL.add("Aaron"); // MySQL添加数据
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();

        System.out.println("\n--------------- Test 2: Redis添加数据: Tony ---------------");
        redis.add("Tony"); // Redis添加数据
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();

        System.out.println("\n--------------- Test 3: ElasticSearch添加数据: Bob,Amy,David ---------------");
        elasticSearch.add("Bob"); // ElasticSearch添加数据
        elasticSearch.add("Amy");
        elasticSearch.add("David");
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();

        System.out.println("\n--------------- Test 4: MySQL移除数据: Amy ---------------");
        mySQL.remove("Amy");    // MySQL移除数据
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();

        System.out.println("\n--------------- Test 5: Redis移除数据: Aaron ---------------");
        redis.remove("Aaron");    // Redis移除数据
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();

        System.out.println("\n--------------- Test 6: ElasticSearch移除数据: Tony ---------------");
        elasticSearch.remove("Tony");    // ElasticSearch移除数据
        // 查看各数据库中的数据
        mySQL.showData();
        redis.showData();
        elasticSearch.showData();
    }
}
