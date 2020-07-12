package DesignPattern.Proxy;

public class MainClass {
    public static void main(String[] args) {
        ISinger lipsyncSinger = new LipsyncSinger();
        lipsyncSinger.sing();
    }
}