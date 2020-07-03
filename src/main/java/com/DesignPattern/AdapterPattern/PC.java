package com.DesignPattern.AdapterPattern;

/**
 * 使用三脚插头供电的电脑
 */
public class PC implements ThreePlug {
    @Override
    public void use3Plug() {
        System.out.println("电脑已插电源，正常工作中...");
    }
}
