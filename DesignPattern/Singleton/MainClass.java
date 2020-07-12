package DesignPattern.Singleton;

public class MainClass {
    public static void main(String[] args) {
        BrowserHistory browserHistory = BrowserHistory.getInstance();

        browserHistory.getVisitedURLList().add("https://github.com");
        browserHistory.getVisitedURLList().add("https://www.youtube.com");

        BrowserHistory anotherBrowserHistory = BrowserHistory.getInstance();
        anotherBrowserHistory.getVisitedURLList().add("https://web.facebook.com");

        System.out.println(browserHistory.getVisitedURLList());
        System.out.println(anotherBrowserHistory.getVisitedURLList());
    }
}