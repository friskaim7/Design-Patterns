package DesignPattern.Facade.Components;

public class Time {
    final int aSecond = 1000000000;
    final int aMinute = 60 * aSecond;
    final int anHour = 3600 * aSecond;

    public void delayForAMinute() {
        for(int i = 1; i <= aMinute; i++){}
    }

    public void delayForAnHour() {
        for(int i = 1; i < anHour; i++){}
    }
}