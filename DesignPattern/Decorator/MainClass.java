package DesignPattern.Decorator;

import DesignPattern.Decorator.Room.*;
import DesignPattern.Decorator.RoomDecorator.*;

public class MainClass {
    public static void main(String[] args) {
        Room bedroomWithDoor = new Door(new BedRoom());
        Room classroomWithDoorwithWindow = new Window(new Door(new ClassRoom()));

        System.out.println(bedroomWithDoor.getDescription());
        System.out.println(classroomWithDoorwithWindow.getDescription());
    }
}