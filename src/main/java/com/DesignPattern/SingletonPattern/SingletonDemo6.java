package com.DesignPattern.SingletonPattern;


/**
 * 单例模式6，枚举法
 */
public enum SingletonDemo6 {
    INSTANCE("我是枚举法的单例");

    private String description;

    /**
     * 枚举的构造器默认访问权限是private, 当然也只能是私有的
     * @param description
     */
    SingletonDemo6(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.println(description);
    }
}
