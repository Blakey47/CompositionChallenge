package com.darraghblake;

public class Window {

    private int height;
    private int width;
    private boolean doubleGlazed;
    private boolean isOpen;

    public Window(int height, int width, boolean doubleGlazed) {
        this.height = height;
        this.width = width;
        this.doubleGlazed = doubleGlazed;
        this.isOpen = false;
    }

    public void openWindow() {
        if(!isOpen) {
            System.out.println("Opening window.");
            isOpen = true;
        } else {
            System.out.println("Window is already open.");
        }
    }

    public void closeWindow() {
        if(isOpen) {
            System.out.println("Closing window.");
            isOpen = false;
        } else {
            System.out.println("Window is already closed.");
        }
    }
}
