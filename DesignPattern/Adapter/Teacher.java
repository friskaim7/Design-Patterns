package DesignPattern.Adapter;

public class Teacher extends Person implements ITeacher{
    public Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println("Mitochondria is the powerhouse of the cell.");
    }
}