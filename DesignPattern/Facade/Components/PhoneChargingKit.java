package DesignPattern.Facade.Components;

public class PhoneChargingKit {
    private boolean pluggedIn;
    private boolean electrified;
    // private Phone phone;

    public PhoneChargingKit()
    {
        this.electrified = false;
        this.pluggedIn = false;
    }

    public boolean isElectrified() {
        return electrified;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void pluggingIn() {
        this.pluggedIn = true;
    }
    public void unplug() {
        this.pluggedIn = false;
    }

    public void switchingOnElectricity() {
        this.electrified = true;
    }

    public void switchingOffElectricity() {
        this.electrified = false;
    }

    public boolean isReadyToCharge() {
        return ((pluggedIn == true) && (electrified == true));
    }
}