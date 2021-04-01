package ru.sbt.mipt.oop;

import ru.sbt.mipt.oop.Action;
import ru.sbt.mipt.oop.HomeObject;
import ru.sbt.mipt.oop.alarm.AlarmState;
import java.util.ArrayList;
import java.util.Collection;

public class SmartHome extends HomeObject implements Actionable {
    Collection<Room> rooms;
    AlarmState alarm;

    public SmartHome() {
        super("home");
        rooms = new ArrayList<>();
    }

    public SmartHome(Collection<Room> rooms) {
        super("home");
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    @Override
    public void execute(Action action) {
        action.accept(this);
        for (Room room: rooms) {
            room.execute(action);
        }
    }

}