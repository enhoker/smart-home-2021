package ru.sbt.mipt.oop.home;
import ru.sbt.mipt.oop.HomeObject;


public class Light extends HomeObject {
    private boolean isOn;

    public Light(String id, boolean isOn) {
        super(id);
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}