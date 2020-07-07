package com.DesignPattern.FacadePattern;

/**
 * 外观模式Demo
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        System.out.println("---------------- Test 1 ----------------");
        // 不使用外观模式，客户端(老王)直接访问各子系统(各电器)
        Tv tv = new Tv();
        AirConditioner airConditioner = new AirConditioner();
        Humidifier humidifier = new Humidifier();

        System.out.println("【老王下班回到家,打开家中所有电器】");
        tv.turnOn();
        airConditioner.turnOn();
        humidifier.turnOn();

        System.out.println("【老王准备出门上班,关闭家中所有电器】");
        tv.turnOff();
        airConditioner.turnOff();
        humidifier.turnOff();

        System.out.println("---------------- Test 2 ----------------");
        // 使用外观模式，客户端(老王)通过外观角色间接访问各子系统(各电器)
        ElectricApplianceFacade electricApplianceFacade = new ElectricApplianceFacade();

        System.out.println("【老王下班回到家,打开家中所有电器】");
        electricApplianceFacade.turnOnAll();

        System.out.println("【老王准备出门上班,关闭家中所有电器】");
        electricApplianceFacade.turnOffAll();
    }
}