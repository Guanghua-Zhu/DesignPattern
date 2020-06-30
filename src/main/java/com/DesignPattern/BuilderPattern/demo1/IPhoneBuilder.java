package com.DesignPattern.BuilderPattern.demo1;

/**
 * 苹果手机建造者
 */
public class IPhoneBuilder implements PhoneBuilder{

    private Phone phone;

    public IPhoneBuilder() {
        phone = new Phone();
    }

    @Override
    public void setBrand() {
        phone.setBrand("Apple");
    }

    @Override
    public void setOs() {
        phone.setOs("IOS");
    }

    @Override
    public void setRamSize() {
        phone.setRamSize(2);
    }

    @Override
    public void setPrice() {
        phone.setPrice(6666.66);
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
