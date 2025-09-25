package com.firstclass;

public class Leaf extends Plant{
    public boolean hasWater;
    public String color;

    public Leaf(String color, boolean hasWater, Plant plant) {
        super(plant.type, plant.age, plant.numLeaves);
        this.color = color;
        this.hasWater = hasWater;
        this.prevLeaves = plant.prevLeaves;
        this.grownNewLeaf = plant.grownNewLeaf;
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
    } 
    public void getNumLeaves() {
        System.out.println("This plant has " + numLeaves + " leaves.");
        System.out.println("This plant had " + prevLeaves + " leaves before the last growth.");
        if (grownNewLeaf) {
            System.out.println("This plant has grown a new leaf since the last check.");
            grownNewLeaf = false;
        } else {
            System.out.println("This plant has not grown a new leaf since the last check.");
        }
    }

}