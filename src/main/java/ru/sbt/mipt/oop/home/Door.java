package ru.sbt.mipt.oop.home;
import ru.sbt.mipt.oop.HomeObject;

public class Door extends HomeObject{
    private boolean isOpen;

    public Door(boolean isOpen, String id) {
        super(id);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}