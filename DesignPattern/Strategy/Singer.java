package DesignPattern.Strategy;

public class Singer extends Entertainer{
    @Override
    public void doMakeUp() {
        System.out.println("*do a fancy make up*");
    }
    
}