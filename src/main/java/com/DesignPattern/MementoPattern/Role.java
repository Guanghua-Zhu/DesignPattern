package com.DesignPattern.MementoPattern;

import lombok.Data;

/**
 * 发起人角色: 游戏角色
 */
@Data       // 可提供各字段的get、set方法
public class Role {
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

    public Role(String roleName, String missionName, Integer hp, Integer mp) {
        this.roleName = roleName;
        this.missionName = missionName;
        this.hp = hp;
        this.mp = mp;
    }

    /**
     * 获取当前游戏状态信息
     * @return
     */
    public void getInfo() {
        String info1 = "游戏状态: <"+ roleName +"> 在 " + missionName;
        String info2 = "         生命值: " + hp + " 魔法值: " + mp + "\n";
        System.out.println(info1);
        System.out.println(info2);
    }

    /**
     * 创建游戏存档
     * @return
     */
    public GameArchive createGameArchive() {
        GameArchive gameArchive = new GameArchive(roleName, missionName, hp, mp);
        return gameArchive;
    }

    /**
     * 加载游戏存档
     * @param gameArchive
     */
    public void loadGameArchive(GameArchive gameArchive) {
        this.roleName = gameArchive.getRoleName();
        this.missionName = gameArchive.getMissionName();
        this.hp = gameArchive.getHp();
        this.mp = gameArchive.getMp();
    }
}
