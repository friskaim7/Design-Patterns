package DesignPattern.Adapter;

public class MainClass {
    public static void main(String[] args) {
        IActress actress = new TeacherAdapter(new Teacher("Severus Snape"));
        actress.speak();   
    }
}