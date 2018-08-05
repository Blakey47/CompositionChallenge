package com.darraghblake;

public class Bed {
    private int length;
    private int width;
    private boolean bedMade;

    public Bed(int length, int width) {
        this.length = length;
        this.width = width;
        this.bedMade = true;
    }

    public void getOutOfBed() {
        System.out.println("Currently getting out of bed.");
        bedMade = false;
    }

    public void makeBed() {
        if(!bedMade) {
            System.out.println("Making the bed.");
            bedMade = true;
        } else {
            System.out.println("The bed is already made.");
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean isBedMade() {
        return bedMade;
    }
}
