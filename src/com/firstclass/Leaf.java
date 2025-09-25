package com.firstclass;

public class Leaf extends Plant{
    public boolean hasWater;
    public String color;

    public Leaf(String color, boolean hasWater, String type, int age, int numLeaves) {
        super(type, age, numLeaves);
        this.color = color;
        this.hasWater = hasWater;
    }
    public String getColor() {
        System.out.println("This leaf is " + color);
        return color;
    }
    public boolean getHasWater() {
        if (hasWater) {
            System.out.println("This leaf has water.");
        } else {
            System.out.println("This leaf does not have water.");
        }
        return hasWater;
    } {
        
    }

}