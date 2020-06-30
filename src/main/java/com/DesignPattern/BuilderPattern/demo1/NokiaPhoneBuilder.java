package com.DesignPattern.BuilderPattern.demo1;

/**
 * 诺基亚手机建造者
 */
public class NokiaPhoneBuilder implements PhoneBuilder {

    private Phone phone;

    public NokiaPhoneBuilder() {
        phone = new Phone();
    }

    @Override
    public void setBrand() {
        phone.setBrand("Nokia");
    }

    @Override
    public void setOs() {
        phone.setOs("Symbian");
    }

    @Override
    public void setRamSize() {
        phone.setRamSize(1);
    }

    @Override
    public void setPrice() {
        phone.setPrice(100.00);
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
