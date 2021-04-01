
package ru.sbt.mipt.oop.adapter;

import ru.sbt.mipt.oop.event.DoorEvent;
import ru.sbt.mipt.oop.event.SensorEvent;
import ru.sbt.mipt.oop.event.DoorEventType;

public class CCDoorEventCreator implements CCEventCreator {
    private final DoorEventType doorEventType;


    public CCDoorEventCreator(DoorEventType type) {
        doorEventType = type;
    }

    @Override
    public SensorEvent create(String id) {
        return new DoorEvent(id, doorEventType);
    }
}