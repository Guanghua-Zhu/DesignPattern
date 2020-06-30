package com.DesignPattern.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("--------- Test 1 ---------");
        PCFactory hpFactory = new HpFactory();
        Monitor monitor = hpFactory.getMonitor();
        Mouse mouse = hpFactory.getMouse();
        Keyboard keyboard = hpFactory.getKeyboard();
        monitor.display();
        mouse.move();
        keyboard.use();

        System.out.println("--------- Test 2 ---------");
        PCFactory  dellFactory = new DellFactory();
        monitor = dellFactory.getMonitor();
        mouse = dellFactory.getMouse();
        keyboard = dellFactory.getKeyboard();
        monitor.display();
        mouse.move();
        keyboard.use();
    }
}
