package com.javarush.task.task39.task3906;

/*
Интерфейсы нас спасут!
*/

public class Solution {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        LightBulb lightBulb = new LightBulb();
        ElectricPowerSwitch ss = new ElectricPowerSwitch(securitySystem);
        ElectricPowerSwitch lb = new ElectricPowerSwitch(lightBulb);

        ss.press();
        ss.press();
        lb.press();
        lb.press();
    }
}


