package com.darraghblake;

public class Main {

    public static void main(String[] args) {

        Door door = new Door(200, 50, "Wood");
        Window window = new Window(120, 100, true);
        Furniture furniture = new Furniture(new Bed(230, 150), new Closet(200, 65, "Wood"));

        Bedroom bedroom = new Bedroom(door, window, furniture);

        bedroom.makeBed();
        bedroom.getOutOfBed();
        bedroom.makeBed();

    }
}
