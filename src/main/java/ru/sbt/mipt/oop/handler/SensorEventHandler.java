package ru.sbt.mipt.oop.handler;

import ru.sbt.mipt.oop.event.SensorEvent;

public interface SensorEventHandler {
    void handleEvent(SensorEvent event);
}