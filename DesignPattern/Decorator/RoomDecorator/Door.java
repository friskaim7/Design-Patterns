package DesignPattern.Decorator.RoomDecorator;

import DesignPattern.Decorator.Room.*;

public class Door extends RoomDecorator {
    private Room room;

    public Door(Room room)
    {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return this.room.getDescription() + " with a door";
    }
    
    
}