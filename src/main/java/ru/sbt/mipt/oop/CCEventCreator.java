package ru.sbt.mipt.oop.adapter;

import ru.sbt.mipt.oop.event.SensorEvent;

public interface CCEventCreator {
    SensorEvent create(String id);
}