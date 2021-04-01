package ru.sbt.mipt.oop.handler;

import ru.sbt.mipt.oop.Action;
import ru.sbt.mipt.oop.event.DoorEvent;
import ru.sbt.mipt.oop.event.SensorEvent;
import ru.sbt.mipt.oop.home.Door;
import ru.sbt.mipt.oop.HomeObject;
import ru.sbt.mipt.oop.objects.SmartHome;

import static ru.sbt.mipt.oop.types.DoorEventType.*;

public class DoorEventHandler implements SensorEventHandler {
    private final SmartHome smartHome;

    public DoorEventHandler(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void handleEvent(SensorEvent event) {
        if (event instanceof DoorEvent) {
            Action action = (HomeObject homeObject) -> {
                if (homeObject instanceof Door && homeObject.getId().equals(event.getObjectId())) {
                    if (((DoorEvent) event).getDoorEventType() == DOOR_OPEN) {
                        OpenTheDoor((Door) homeObject);
                    } else {
                        CloseTheDoor((Door) homeObject);
                    }
                }
            };
            smartHome.execute(action);
        }
    }

    private void CloseTheDoor(Door door) {
        door.setOpen(false);
        System.out.println("Door " + door.getId()  + " was closed.");
    }

    private void OpenTheDoor(Door door) {
        door.setOpen(true);
        System.out.println("Door " + door.getId()  + " was opened.");
    }
}