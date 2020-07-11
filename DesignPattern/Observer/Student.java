package DesignPattern.Observer;

import java.util.ArrayList;

public class Student implements ISubject {
    private final String DEFAULT_NAME = "";

    private ArrayList<IObserver> observers;

    private String name;
    private Assigment assigment;

    public Student() {
        this.observers = new ArrayList<IObserver>();
        this.assigment = new Assigment();
        this.name = DEFAULT_NAME;
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssigment() {
        this.assigment = new Assigment();
    }

    public void submit(int hour, int minute) {
        assigment.submitted = true;
        notifyObservers(hour, minute);
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers(int hour, int minute) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.name, hour, minute);
        }
    }
}