package com.DesignPattern.BuilderPattern.demo1;

/**
 * Builder Patter 建造者模式 Demo
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        // 1. 创建一个导演
        PhoneDirector phoneDirector = new PhoneDirector();

        /***** 2. 创建 iPhone 实例 *****/
        // 2a. 创建一个 iPhone建造者
        IPhoneBuilder iPhoneBuilder = new IPhoneBuilder();
        // 2b. 导演指导 iPhone建造者 来建造一个iPhone的实例
        phoneDirector.construct(iPhoneBuilder);
        // 2c. 从 iPhone建造者 中获取实例
        Phone iPhone = iPhoneBuilder.getPhone();
        System.out.println(iPhone);

        /***** 3. 创建 Xiao Mi Phone 实例 *****/
        // 3a. 创建一个 MiPhone建造者
        MiPhoneBuilder miPhoneBuilder = new MiPhoneBuilder();
        // 3b. 导演指导 MiPhone建造者 来建造一个MiPhone的实例
        phoneDirector.construct(miPhoneBuilder);
        // 3c. 从 MiPhone建造者 中获取实例
        Phone miPhone = miPhoneBuilder.getPhone();
        System.out.println(miPhone);

        /***** 4. 创建 Nokia Phone实例 *****/
        // 4a. 创建一个 Nokia Phone建造者
        NokiaPhoneBuilder nokiaPhoneBuilder = new NokiaPhoneBuilder();
        // 4b. 导演指导 NokiaPhone建造者 来建造一个NokiaPhone的实例
        phoneDirector.construct(nokiaPhoneBuilder);
        // 4c. 从 NokiaPhone建造者 中获取实例
        Phone nokiaPhone = nokiaPhoneBuilder.getPhone();
        System.out.println(nokiaPhone);
    }
}
