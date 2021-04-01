package ru.sbt.mipt.oop.event;

import ru.sbt.mipt.oop.type.AlarmEventType;

public class AlarmEvent extends SensorEvent {
    private final AlarmEventType alarmEventType;
    private final String code;

    public AlarmEvent(AlarmEventType alarmEventType, String code) {
        super("alarm");
        this.alarmEventType = alarmEventType;
        this.code = code;
    }

    public AlarmEventType getAlarmEventType() {
        return alarmEventType;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "AlarmEvent{" +
                "alarmEventType=" + alarmEventType +
                ", code='" + code + '\'' +
                '}';
    }
}