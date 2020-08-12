package com.DesignPattern.MediatorPattern;

/**
 * 具体中介者角色: 数据同步中介者
 */
public class DataSyncMediator extends Mediator {
    private MySQL mySQL;
    private Redis redis;
    private ElasticSearch elasticSearch;

    public void setMySQL(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    public void setReis(Redis redis) {
        this.redis = redis;
    }

    public void setElasticSearch(ElasticSearch elasticSearch) {
        this.elasticSearch = elasticSearch;
    }

    @Override
    void syncAddData(String str, String name) {
        // 添加数据时, 其它各数据库均需进行同步添加
        switch (name) {
            case "MySQL":
                redis.addData(str);
                elasticSearch.addData(str);
                break;
            case "Redis":
                mySQL.addData(str);
                elasticSearch.addData(str);
                break;
            case "ElasticSearch":
                mySQL.addData(str);
                redis.addData(str);
                break;
        }
    }

    @Override
    void syncRemoveData(String str, String name) {
        switch (name) {
            // MySQL数据库移除数据时，其它各数据库均需移除相应数据
            case "MySQL":
                redis.removeData(str);
                elasticSearch.removeData(str);
                break;
            // Redis数据库移除数据时，则只有ElasticSearch数据库需移除相应数据
            case "Redis":
                elasticSearch.removeData(str);
                break;
            // ElasticSearch数据库移除数据时，则只有Redis数据库需移除相应数据
            case "ElasticSearch":
                redis.removeData(str);
                break;
        }
    }
}
