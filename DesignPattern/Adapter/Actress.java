package DesignPattern.Adapter;

public class Actress extends Person implements IActress{
    public Actress(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Hi, I am " + this.getName() + " and I am an actress.");
    }

}