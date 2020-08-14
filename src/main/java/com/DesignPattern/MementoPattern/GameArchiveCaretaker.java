package com.DesignPattern.MementoPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 负责人角色: 游戏存档的负责人
 */
public class GameArchiveCaretaker {

    /**
     * key: 存档名称; value: 相应游戏存档
     */
    private Map<String, GameArchive> map = new HashMap<>();

    /**
     * 添加游戏存档
     * @param gameArchive
     */
    public void addGameArchive(GameArchive gameArchive) {
        // 使用游戏角色名称、游戏关卡名称作为游戏存档的名称
        String gameArchiveName = gameArchive.getRoleName() + "-" + gameArchive.getMissionName();
        map.put( gameArchiveName, gameArchive );
    }

    /**
     * 根据游戏存档名称获取指定游戏存档
     * @param gameArchiveName
     * @return
     */
    public GameArchive getGameArchive(String gameArchiveName) {
        GameArchive gameArchive = map.get(gameArchiveName);
        return gameArchive;
    }

    /**
     * 查看游戏存档列表
     */
    public void viewGameArhiveNameList() {
        Set gameArhiveNameList = map.keySet();
        String str = "游戏存档列表: " + gameArhiveNameList.toString() + "\n";
        System.out.println(str);
    }
}
