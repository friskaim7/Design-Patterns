package DesignPattern.Decorator.RoomDecorator;

import DesignPattern.Decorator.Room.*;

public class Window extends RoomDecorator {
    private Room room;

    public Window(Room room)
    {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return this.room.getDescription() + " with a window";
    }
    
}