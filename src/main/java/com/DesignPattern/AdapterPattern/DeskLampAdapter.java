package com.DesignPattern.AdapterPattern;

/**
 * 台灯插头适配器, 使得其可以使用三脚插座
 * @apiNote 类适配器
 */
public class DeskLampAdapter extends DeskLamp implements ThreePlug {
    @Override
    public void use3Plug() {
        use2Plug();
    }
}