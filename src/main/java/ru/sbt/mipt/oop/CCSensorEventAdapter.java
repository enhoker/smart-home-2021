package ru.sbt.mipt.oop;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ru.sbt.mipt.oop.SmartHome;
import com.coolcompany.smarthome.event.CCSensorEvent;
import com.coolcompany.smarthome.event.EventHandler;
import ru.sbt.mipt.oop.event.SensorEvent;
import ru.sbt.mipt.oop.alarm.SmartAlarm;
import ru.sbt.mipt.oop.handler.*;
import ru.sbt.mipt.oop.handler.AlarmSensorEventHandler;


public class CCSensorEventAdapter implements EventHandler {
    private final SmartHome smartHome;
    private final SmartAlarm smartAlarm;
    private final Map<String, CCEventCreator> map;
    private final List<SensorEventHandler> handlers;

    public CCSensorEventAdapter(SmartHome home, SmartAlarm alarm, Map<String, CCEventCreator> inMap, List<SensorEventHandler> listHanders) {
        smartHome = home;
        smartAlarm = alarm;
        map = inMap;
        handlers = listHandlers;
    }

    @Override
    public void handleEvent(CCSensorEvent event) {
        String type = event.getEventType();
        if (!map.containsKey(type)) return;
        SensorEvent sensorEvent = map.get(type).create(event.getObjectId());

        for (SensorEventHandler handler : handlers) {
            handler.handleEvent(sensorEvent);
        }
    }
}