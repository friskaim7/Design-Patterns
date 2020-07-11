package DesignPattern.Adapter;

public class TeacherAdapter implements IActress {
    ITeacher notARealTeacher;

    TeacherAdapter(ITeacher teacher) {
        this.notARealTeacher = teacher;
    }

    @Override
    public void speak() {
        notARealTeacher.teach();

    }
}