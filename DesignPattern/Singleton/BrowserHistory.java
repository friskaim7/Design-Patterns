package DesignPattern.Singleton;

import java.util.ArrayList;

public class BrowserHistory {
    private static BrowserHistory browserHistoryInstance = null;
    private ArrayList<String> visitedURLList;

    private BrowserHistory() {
        this.visitedURLList = new ArrayList<String>();
    }

    public static BrowserHistory getInstance() {
        if (BrowserHistory.browserHistoryInstance == null) {
            BrowserHistory.browserHistoryInstance = new BrowserHistory();
        }
        return BrowserHistory.browserHistoryInstance;
    }

    public ArrayList<String> getVisitedURLList() {
        return visitedURLList;
    }
}