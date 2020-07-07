package com.DesignPattern.FacadePattern;

/**
 * 家用电器的外观角色
 */
public class ElectricApplianceFacade {
    /**
     * 子系统：电视
     */
    private Tv tv;

    /**
     * 子系统：空调
     */
    private AirConditioner airConditioner;

    /**
     * 子系统：加湿器
     */
    private Humidifier humidifier;

    public ElectricApplianceFacade() {
        this.tv = new Tv();
        this.airConditioner = new AirConditioner();
        this.humidifier = new Humidifier();
    }

    /**
     * 打开所有家用电器
     */
    public void turnOnAll() {
        tv.turnOn();
        airConditioner.turnOn();
        humidifier.turnOn();
    }

    /**
     * 关闭所有家用电器
     */
    public void turnOffAll() {
        tv.turnOff();
        airConditioner.turnOff();
        humidifier.turnOff();
    }
}