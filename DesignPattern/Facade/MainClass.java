package DesignPattern.Facade;

public class MainClass {
    public static void main(String[] args) {
        PhoneChargingFacade phoneFacade = new PhoneChargingFacade();
        System.out.println("Current saved : " + phoneFacade.phone.getBattery().getCurrentSaved() + "\n");
        phoneFacade.goCharging();
        if(!phoneFacade.phone.getBattery().isNotFull()) {
            phoneFacade.stopCharging();
        }
        System.out.println("\nCurrent saved :" + phoneFacade.phone.getBattery().getCurrentSaved());
    }
}