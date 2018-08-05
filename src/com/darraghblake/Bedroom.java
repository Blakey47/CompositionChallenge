package com.darraghblake;

public class Bedroom {

    private Door theDoor;
    private Window theWindow;
    private Furniture theFurniture;

    public Bedroom(Door theDoor, Window theWindow, Furniture theFurniture) {
        this.theDoor = theDoor;
        this.theWindow = theWindow;
        this.theFurniture = theFurniture;
    }

    public void openDoor() {
        theDoor.openDoor();
    }

    public void closeDoor() {
        theDoor.closeDoor();
    }

    public void getOutOfBed() {
        theFurniture.getBed().getOutOfBed();
    }

    public void makeBed() {
        theFurniture.getBed().makeBed();
    }
}
