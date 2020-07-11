package DesignPattern.Facade.Components;

public class Battery {
    private final int DEFAULT_CAPACITY = 2400;
    private final int DEFAULT_CHARGING_SPEED = 100;
    private final int DEFAULT_CURRENT_SAVED = 2000;
    private final String DEFAULT_TYPE = "Li-Ion";
    private final int ONE_HUNDRED_PERCENT = 100;

    private int capacity;
    private int chargingSpeed;
    private int currentSaved;
    private String type;
    private PhoneChargingKit chargerPlug;
    private PhoneChargingKit USBPort;

    protected Battery() {
        this.capacity = DEFAULT_CAPACITY;
        this.chargingSpeed = DEFAULT_CHARGING_SPEED;
        this.currentSaved = DEFAULT_CURRENT_SAVED;
        this.type = DEFAULT_TYPE;

        this.chargerPlug = new PhoneChargingKit();
        this.USBPort = new PhoneChargingKit();
    }

    protected Battery(String type) {
        this();
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public PhoneChargingKit getChargerPlug() {
        return chargerPlug;
    }

    public float getChargingSpeed() {
        return chargingSpeed;
    }

    public int getCurrentPercentage() {
        return currentSaved/capacity * ONE_HUNDRED_PERCENT;
    }

    public int getCurrentSaved() {
        return currentSaved;
    }

    public String getType() {
        return type;
    }

    public PhoneChargingKit getUSBPort() {
        return USBPort;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setChargerPlug(PhoneChargingKit chargerPlug) {
        this.chargerPlug = chargerPlug;
    }

    public void setChargingSpeed(int chargingSpeed) {
        this.chargingSpeed = chargingSpeed;
    }

    public void setUSBPort(PhoneChargingKit uSBPort) {
        USBPort = uSBPort;
    }

    public void setCurrentSaved(int currentSaved) {
        this.currentSaved = currentSaved;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNotFull() {
        return currentSaved < capacity;
    }

    public void charging() {
        Time time = new Time();
        while ((chargerPlug.isReadyToCharge() && USBPort.isReadyToCharge()) && (isNotFull())) {
            currentSaved += chargingSpeed;
            System.out.println("Current Saved : " + currentSaved);
            time.delayForAMinute();
        }
    }
}