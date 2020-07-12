package DesignPattern.Strategy;

public abstract class Entertainer {
    private IShowPerformance performance;
    
    public void setPerformance(IShowPerformance performance) {
        this.performance = performance;
    }
    public void showPerformance()
    {
        this.performance.showPerformance();
    }

    public abstract void doMakeUp();
        
}