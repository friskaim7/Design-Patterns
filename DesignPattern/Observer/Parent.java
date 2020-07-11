package DesignPattern.Observer;

public class Parent implements IObserver {

    @Override
    public void update(String name, int hour, int minute) {
        System.out.println("Your child (" + name + ") submitted the assignment on " + hour + ":" + minute);
    }

}