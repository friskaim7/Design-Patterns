package DesignPattern.Observer;

public class Teacher implements IObserver {

    @Override
    public void update(String name, int hour, int minute) {
        System.out.println("Your student (" + name +") submitted the assignment on " + hour + ":" + minute);

    }

}