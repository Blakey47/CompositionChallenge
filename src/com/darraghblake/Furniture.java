package com.darraghblake;

public class Furniture {
    private Bed bed;
    private Closet closet;

    public Furniture(Bed bed, Closet closet) {
        this.bed = bed;
        this.closet = closet;
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }
}
