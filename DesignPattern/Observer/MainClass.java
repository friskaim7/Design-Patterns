package DesignPattern.Observer;

public class MainClass {
    public static void main(String[] args) {
        IObserver parent = new Parent();
        IObserver teacher = new Teacher();
        Student friska = new Student("Friska");

        friska.addObserver(parent);
        friska.addObserver(teacher);

        friska.submit(10, 15);
    }
}