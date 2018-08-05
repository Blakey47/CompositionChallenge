package com.darraghblake;

public class Door {

    private int height;
    private int width;
    private String material;
    private boolean isOpen;

    public Door(int height, int width, String material) {
        this.height = height;
        this.width = width;
        this.material = material;
        this.isOpen = false;
    }

    public void openDoor() {
        if(!isOpen) {
            System.out.println("Opening door.");
            isOpen = true;
        } else {
            System.out.println("Door is already open.");
        }
    }

    public void closeDoor() {
        if(isOpen) {
            System.out.println("Closing door.");
            isOpen = false;
        } else {
            System.out.println("Door is already closed.");
        }
    }

}
