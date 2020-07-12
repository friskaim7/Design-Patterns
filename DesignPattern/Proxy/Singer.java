package DesignPattern.Proxy;

public class Singer implements ISinger {

    @Override
    public void sing() {
        System.out.println("You raise me up ~");
    }
    
}