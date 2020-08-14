package com.DesignPattern.MementoPattern;

import lombok.Getter;

/**
 * 备忘录角色：游戏存档
 */
@Getter     // 可提供各字段的get方法
public class GameArchive {
    /**
     * 游戏角色姓名
     */
    private String roleName;

    /**
     * 游戏关卡名称
     */
    private String missionName;

    /**
     * 生命值
     */
    private Integer hp;

    /**
     * 魔法值
     */
    private Integer mp;

    public GameArchive(String roleName, String missionName, Integer hp, Integer mp) {
        this.roleName = roleName;
        this.missionName = missionName;
        this.hp = hp;
        this.mp = mp;
    }

}
