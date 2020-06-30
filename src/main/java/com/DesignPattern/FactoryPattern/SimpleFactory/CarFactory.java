package com.DesignPattern.FactoryPattern.SimpleFactory;

/**
 * 工厂角色
 */
public class CarFactory {
    public static Car getCar(String type) {
        if( type==null ) {
            return null;
        }
        Car car = null;
        switch (type) {
            case "BMW":
                car = new BMW();
                break;
            case "Benz":
                car = new Benz();
                break;
            case "RollsRoyce":
                car = new RollsRoyce();
                break;
            default:
                car = null;
        }
        return car;
    }
}
