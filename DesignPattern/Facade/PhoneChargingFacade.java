package DesignPattern.Facade;

import DesignPattern.Facade.Components.*;

public class PhoneChargingFacade {
    Phone phone;

    public PhoneChargingFacade()
    {
        phone = new Phone();
    }

    public void goCharging()
    {
        phone.getBattery().getChargerPlug().pluggingIn();
        System.out.println("Charger Plug plugged in.");
        phone.getBattery().getUSBPort().pluggingIn();
        System.out.println("USB Port plugged in.");
        phone.getBattery().getChargerPlug().switchingOnElectricity();
        System.out.println("Charger Plug switched on.");
        phone.getBattery().getUSBPort().switchingOnElectricity();
        System.out.println("USB Port switched on.");
        phone.getBattery().charging();
    }

    public void stopCharging() {
        phone.getBattery().getChargerPlug().switchingOffElectricity();
        System.out.println("Charger Plug switched off.");
        phone.getBattery().getChargerPlug().switchingOffElectricity();
        System.out.println("USB Port switched off");
        phone.getBattery().getChargerPlug().unplug();
        System.out.println("Charger Plug unplugged.");
        phone.getBattery().getUSBPort().unplug();
        System.out.println("USB Port unplugged.");
    }
    
}