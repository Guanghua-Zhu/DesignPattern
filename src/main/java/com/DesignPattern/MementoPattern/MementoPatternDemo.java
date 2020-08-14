package com.DesignPattern.MementoPattern;

/**
 * Memento Pattern 备忘录模式 Demo
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        // 构造游戏存档负责人, 用于管理游戏存档
        GameArchiveCaretaker gameArchiveCaretaker = new GameArchiveCaretaker();
        // 创建游戏角色,开始游戏
        Role role = new Role("林克", "第一关: 玛雅神庙", 100, 100);
        role.getInfo();
        // 创建游戏存档并交由负责人管理、存储
        gameArchiveCaretaker.addGameArchive( role.createGameArchive() );

        // 经过一番激烈战斗，现在来到了第二关
        role.setMissionName("第二关: 雷电圣兽");
        role.setHp(90);
        role.setMp(70);
        role.getInfo();
        // 创建游戏存档并交由负责人管理、存储
        gameArchiveCaretaker.addGameArchive( role.createGameArchive() );

        // 查看游戏存档列表
        gameArchiveCaretaker.viewGameArhiveNameList();

        // 不幸的是, 经过第二关的激烈战斗后, 虽然侥幸来到了第三关, 但生命已经岌岌可危
        role.setMissionName("第三关: 二河流域");
        role.setHp(11);
        role.setMp(7);
        role.getInfo();

        // 这样下去显然无法通关啊, 算了重新读档, 把第二关重新打一次吧
        String gameArchiveName = "林克-第二关: 雷电圣兽";    // 游戏存档名称
        // 从负责人中获取相应的游戏存档, 并加载恢复回来
        role.loadGameArchive(  gameArchiveCaretaker.getGameArchive(gameArchiveName) );
        role.getInfo();
    }
}
