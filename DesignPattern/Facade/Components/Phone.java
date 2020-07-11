package DesignPattern.Facade.Components;

public class Phone {
    private final String DEFAULT_BRAND = "";
    
    private Battery battery;
    private String brand;
    // et cetera...

    public Phone() {
        this.battery = new Battery();
        this.brand = DEFAULT_BRAND;
    }

    public Phone(String brand) {
        this();
        this.brand = brand;
    }

    public Battery getBattery() {
        return battery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}