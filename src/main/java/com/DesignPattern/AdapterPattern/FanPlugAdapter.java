package com.DesignPattern.AdapterPattern;

/**
 * 电扇插头适配器, 使得其可以使用三脚插座
 * @apiNote 对象适配器
 */
public class FanPlugAdapter implements ThreePlug{
    /**
     * 持有电扇对象引用
     */
    private Fan fan;

    public FanPlugAdapter(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void use3Plug() {
        fan.use2Plug();
    }
}
