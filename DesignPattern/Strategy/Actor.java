package DesignPattern.Strategy;

public class Actor extends Entertainer {

    @Override
    public void doMakeUp() {
        System.out.println("*do an uncommon make up like Thanos*");
    }
}