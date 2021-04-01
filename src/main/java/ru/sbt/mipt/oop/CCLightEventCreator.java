package ru.sbt.mipt.oop.adapter;

import ru.sbt.mipt.oop.event.LightEvent;
import ru.sbt.mipt.oop.event.SensorEvent;
import ru.sbt.mipt.oop.type.LightEventType;

public class CCLightEventCreator implements CCEventCreator {
    private final LightEventType lightEvenType;


    public CCLightEventCreator(LightEventType type) {
        lightEvenType = type;
    }

    @Override
    public SensorEvent create(String id) {
        return new LightEvent(id, lightEvenType);
    }
}