package DesignPattern.Strategy;

public class MainClass {
    public static void main(String[] args) {
        IShowPerformance singBehaviour = new SingBehaviour();
        IShowPerformance actingBehaviour = new ActingBehaviour();

        Entertainer singer = new Singer();
        singer.setPerformance(singBehaviour);

        Entertainer actor = new Actor();
        actor.setPerformance(actingBehaviour);

        singer.doMakeUp();
        singer.showPerformance();

        actor.doMakeUp();
        actor.showPerformance();
    }
}