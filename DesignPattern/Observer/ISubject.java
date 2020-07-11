package DesignPattern.Observer;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(int hour, int minute);   
}