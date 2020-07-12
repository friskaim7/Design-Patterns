package DesignPattern.Proxy;

public class LipsyncSinger implements ISinger {
    private Singer realSinger = null;

    @Override
    public void sing() {
        if (this.realSinger == null) {
            this.realSinger = new Singer();
        }
        this.realSinger.sing();
    }
}