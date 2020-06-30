package com.DesignPattern.BuilderPattern.demo1;

/**
 * 小米手机建造者
 */
public class MiPhoneBuilder implements PhoneBuilder {

    private Phone phone;

    public MiPhoneBuilder() {
        phone = new Phone();
    }

    @Override
    public void setBrand() {
        phone.setBrand("Xiao Mi");
    }

    @Override
    public void setOs() {
        phone.setOs("Android");
    }

    @Override
    public void setRamSize() {
        phone.setRamSize(8);
    }

    @Override
    public void setPrice() {
        phone.setPrice(1999.99);
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
